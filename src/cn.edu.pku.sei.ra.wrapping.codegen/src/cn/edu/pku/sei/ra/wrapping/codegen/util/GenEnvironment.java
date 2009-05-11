/**
 * Copyright (c) 2008, Song Hui, Peking University, All rights
 * reserved.
 */
package cn.edu.pku.sei.ra.wrapping.codegen.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode;

/**
 * 
 */
public class GenEnvironment {
	
	public static final String CREATE="Create";
	public static final String DESTROY="Destroy";
	public static final String LOOKUP="Lookup";
	public static final String IDENTIFY="Identify";
	public static final String GET="Get";
	public static final String SET="Set";
	public static final String LIST_SUB="ListSub";
	public static final String INSERT="Insert";
	public static final String REMOVE="Remove";
	public static final String UTIL_METHOD="UtilMethod";
	public static final String UTIL_FIELD="UtilField";
	
	private GenModel genModel;
	private EPackage ePackage;
	private Decoration decoration;
	
	public static GenEnvironment eINSTANCE=null;
	
	public static void init(GenModel genModel, EPackage ePackage, Decoration decoration){
		eINSTANCE=new GenEnvironment();
		eINSTANCE.decoration=decoration;
		eINSTANCE.ePackage=ePackage;
		eINSTANCE.genModel=genModel;
	}

	/**
	 * 
	 */
	protected GenEnvironment() {
		// TODO Auto-generated constructor stub
	}
	
	public String retrieveSpecType(EClass clazz){
		for(ClassMap cm:decoration.getMapArea().getClassMap()){
			if(cm.getClassRef().getName().equals(clazz.getName())){
				if(cm.getSpecType()!=null && cm.getSpecType().length()>0)
					return cm.getSpecType();
			}
		}
		EList<EClass> sup=clazz.getESuperTypes();
		if(sup.size()>=1){
			return retrieveSpecType(sup.get(0));
		}
		return "Object";
	}
	
	public SpecCode retrieveSpecCode(EClass clazz,String id){
		SpecCode found=basicRetrieveSpecCode(clazz,id);
		if(found!=null)
			return found;
		while(found==null){
			EList<EClass> sup=clazz.getESuperTypes();
			if(sup.size()==0)
				break;
			clazz=sup.get(0);
			found=basicRetrieveSpecCode(clazz,id);
			if(found!=null && found.isFinal())
				found=null;
		}
		if(found==null)
			found=retrieveGlobalSpecCode(id);
		return found;		
	}
	
	public SpecCode retrieveGlobalSpecCode(String id){
		SpecCode found=null;
		for(SpecCode s:
			decoration.getMapArea().getGlobalMap().getSpecCode()
			){
			if(s.eClass().getName().equals(id)){
				found=s;
				break;
			}
		}
		return found;
	}
	public FeatureMap retrieveFeatureMap(
			EClass clazz,
			String featureName)
	{
		FeatureMap result=null;
		ClassMap found=null;
		for(ClassMap cm:decoration.getMapArea().getClassMap()){
			if(cm.getClassRef().getName().equals(clazz.getName())){
				found=cm;
				break;
			}			
		}
		if(found!=null){		
			for(FeatureMap fm:found.getFeatureMap()){
				if(fm.getFeature().getName().equals(featureName)){
					result=fm;
					break;
				}
			}
		}
		return result;
	}
	public SpecCode retrieveSpecCode(
			EClass clazz,
			String featureName,
			String id){
		ClassMap found=null;
		for(ClassMap cm:decoration.getMapArea().getClassMap()){
			if(cm.getClassRef().getName().equals(clazz.getName())){
				found=cm;
				break;
			}			
		}
		if(found!=null){		
			for(FeatureMap fm:found.getFeatureMap()){
				if(fm.getFeature().getName().equals(featureName)){
					for(SpecCode sc:fm.getSpecCode()){
						if(sc.eClass().getName().equals(id))
							return sc;
					}
					break;
				}
			}
			for(SpecCode sc:found.getSpecCode())
				if(sc.eClass().getName().equals(id))
					return sc;
		}		
		
		EList<EClass> sup=clazz.getESuperTypes();
		SpecCode res=null;
		if(sup.size()>0){
			res=retrieveSpecCode(sup.get(0),featureName,id);
			if(res!=null && res.isFinal())
				res=null;
		}
		if(res==null)
			res=retrieveGlobalSpecCode(id);
		return res;
	}
	
	protected SpecCode basicRetrieveSpecCode(EClass clazz,String id){
		ClassMap found=null;
		for(ClassMap cm:decoration.getMapArea().getClassMap()){
			if(cm.getClassRef().getName().equals(clazz.getName())){
				found=cm;
				break;
			}			
		}
		if(found==null)
			return null;
		SpecCode specCode=null;
		for(SpecCode s:found.getSpecCode()){
			if(s.eClass().getName().equals(id)){
				specCode=s;
				break;
			}
		}
		return specCode;
	}
	
	public String preProc(String code, GenFeature genFeature, GenClass genClass, GenPackage genPackage){
		this.genFeature=genFeature;
		this.genClass=genClass;
		this.genPackage=genPackage;
		String regx="[$](\\w)+";
		Pattern p=Pattern.compile(regx);
		while(true){
			Matcher m=p.matcher(code);
			if(!m.find())
				break;
			String variable=m.group();
			String value=readVariable(variable);
			code=code.replaceAll("[$]"+variable.substring(1),value);
		}
		return code;
	}
	
	private GenFeature genFeature;
	private GenClass genClass;
	private GenPackage genPackage;
	
	public String readVariable(String variable){
		if(variable.equals("$feature_name"))
			return genFeature.getSafeName();
		if(variable.equals("$feature_type"))
			return genFeature.getEcoreFeature().getEType().getName();
		if(variable.equals("$core"))
			return "core";
		if(variable.equals("$global"))
			return "((" +
					genPackage.getPackageClassName()+
					")" +
					genPackage.getPackageInterfaceName()+
					".eINSTANCE)";
		if(variable.equals("$result"))
			return "result";
		if(variable.equals("$arg0"))
			return "arg0";
		if(variable.equals("$spec_type"))
			return retrieveSpecType(genClass.getEcoreClass());
		return "";
	}
	

	public GenModel getGenModel() {
		return genModel;
	}

	public EPackage getEPackage() {
		return ePackage;
	}

	public Decoration getDecoration() {
		return decoration;
	}
	
	public void generateImport(StringBuffer stringBuffer, GenClass genClass){
		for(String s:getDecoration().getImportClass().getFullClassName()){
			s=s.trim();
			if(!s.startsWith("import"))
				s="import "+s;
			if(!s.endsWith(";"))
				s=s+";";
			stringBuffer.append(s);
			stringBuffer.append("\n");
		}
	}

}
