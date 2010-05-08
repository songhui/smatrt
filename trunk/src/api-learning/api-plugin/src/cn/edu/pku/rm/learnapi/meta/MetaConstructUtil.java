package cn.edu.pku.rm.learnapi.meta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class MetaConstructUtil {
	public static void simplify(EPackage pkg){
		for(int i=0;i<5;i++){
			for(EClassifier classifier:pkg.getEClassifiers())
				simRefToAttr((EClass)classifier);
			for(EClassifier classifier:pkg.getEClassifiers())
				simRelayClass((EClass)classifier);
			for(EClassifier classifier:pkg.getEClassifiers())
				simShortcut((EClass)classifier);
			
		}
		for(EClassifier classifier:pkg.getEClassifiers())
			simSameNameAttr((EClass)classifier);
		clearDangle(pkg);	
	}
	
	public static void simSameNameAttr(EClass clazz){
		boolean goon=true;
		while(goon){
			goon=false;
			EStructuralFeature found=null;
			for(EStructuralFeature f1:clazz.getEStructuralFeatures()){
				for(EStructuralFeature f2:clazz.getEStructuralFeatures()){
					if(f1==f2 || !(f1.getName().equals(f2.getName())))
						continue;
					if(f1 instanceof EAttribute && f2 instanceof EAttribute){
						found=f1;
						goon=true;
					}
					if(found!=null)
						break;
				}
				if(found!=null)
					break;
			}
			if(found!=null)
				clazz.getEStructuralFeatures().remove(found);
		}
	}
	
	public static void simRefToAttr(EClass clazz){
		List<EStructuralFeature> toChange=new ArrayList<EStructuralFeature>();
		for(EStructuralFeature feature:clazz.getEStructuralFeatures()){
			if(!(feature instanceof EReference))
				continue;
			EClass refType=(EClass)((EReference)feature).getEType();
			if(refType.getEStructuralFeatures().isEmpty())
				toChange.add((feature));
			
		}
		for(EStructuralFeature fea:toChange){
			EAttribute attr=EcoreFactory.eINSTANCE.createEAttribute();
			attr.setName(fea.getName());
			attr.setEType(EcorePackage.Literals.EJAVA_OBJECT);
			clazz.getEStructuralFeatures().add(attr);
		}
		clazz.getEStructuralFeatures().removeAll(toChange);
	}
	
	public static void simRelayClass(EClass clazz){
		List<EStructuralFeature> toRemove=new ArrayList<EStructuralFeature>();
		List<EStructuralFeature> toAdd=new ArrayList<EStructuralFeature>();
		for(EStructuralFeature feature:clazz.getEStructuralFeatures()){
			if(!(feature instanceof EReference))
				continue;
			EClass refType=(EClass)((EReference)feature).getEType();
			if(refType.getEAllReferences().size()==1 && refType.getEAllAttributes().isEmpty()){
				Boolean engaged=false;
				for(EClassifier c:clazz.getEPackage().getEClassifiers())
					for(EStructuralFeature f:((EClass)c).getEStructuralFeatures())
						if(f!=feature && f.getEType()==refType){
							engaged=true;
							break;
						}
				if(engaged)
					continue;
				toRemove.add(feature);
				EStructuralFeature remoteRef=refType.getEStructuralFeatures().get(0);
				remoteRef.setName(feature.getName()+remoteRef.getName());
				toAdd.add(remoteRef);
			}
						
		}
		clazz.getEStructuralFeatures().removeAll(toRemove);
		clazz.getEStructuralFeatures().addAll(toAdd);
		
	}
	
	public static void simShortcut(EClass clazz){
		List<EStructuralFeature> toRemove=new ArrayList<EStructuralFeature>();
		for(EStructuralFeature feature:clazz.getEStructuralFeatures()){
			if(!(feature instanceof EReference))
				continue;
			EReference ref=(EReference) feature;
			pool.clear();
			EClassifier type=ref.getEType();
			ref.setEType(null);
			reach(clazz);
			if(pool.contains(type))
				toRemove.add(ref);
			else
				ref.setEType(type);
		}
		clazz.getEStructuralFeatures().removeAll(toRemove);		
			
	}
	
	public static Set<EClass> pool=new HashSet<EClass>();
	
	public static void clearDangle(EPackage pkg){
		pool.clear();
		EClass root=(EClass)pkg.getEClassifier("Root");
		reach(root);
		List<EClassifier> dangles=new ArrayList<EClassifier>();
		for(EClassifier c:pkg.getEClassifiers()){
			if(pool.contains(c))
				;
			else
				dangles.add(c);
		}
		pkg.getEClassifiers().removeAll(dangles);
	}
	
	private static void reach(EClass clazz){
		if(clazz==null)
			return;
		if(pool.contains(clazz))
			return;
		pool.add(clazz);
		for(EStructuralFeature fea:clazz.getEStructuralFeatures()){
			if(fea instanceof EReference)
				reach((EClass)fea.getEType());
		}
	}
	
}
