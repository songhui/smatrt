package cn.edu.pku.rm.learnapi;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.Statement;

import cn.edu.pku.sei.ra.dt.DtPackage;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;

public class SourceSampleUtil {
	
	public static String[] API_PACKAGE=new String[]{"javax.management","javax.naming"};
	
	
	public static ASTNode getInitialASTRoot(String projectname, String filepath){
		IProject prj=ResourcesPlugin.getWorkspace()
		.getRoot().getProject(projectname);
	
		IPath path=new Path(filepath);
		IFile file=prj.getFile(path);
		
		System.out.print(file.getFullPath());
		
		JavaCore core=JavaCore.getJavaCore();
		
		ICompilationUnit src=core.createCompilationUnitFrom(file);
				
		ASTParser parser=ASTParser.newParser(AST.JLS3);
		parser.setResolveBindings(true);
		parser.setStatementsRecovery(true);
		IJavaProject jprj=JavaCore.create(prj);		
		parser.setProject(jprj);		
		parser.setSource(src);
		
		ASTNode astNode=parser.createAST(null);
		return astNode;
	}
	
	public static ASTNode traceStatementOrMethod(Name name){
		ASTNode parent=name.getParent();
		while(true){
			if(parent instanceof Statement)
				return parent;
			else if(parent instanceof MethodDeclaration)
				return parent;
			else
				parent=parent.getParent();
		}
			
	}
	
	public static void printRepResult(List<Repository> reps) throws IOException{
		
		for(Repository rep:reps){
			TraceBuilder tb=(TraceBuilder)rep.getTracerBuilder();
			for(Tracer tr:tb.tracerLib.values()){
				System.out.println(tr);
			}
			
			rep.clearTemp();
			for(Place place:rep.getPlace())
				place.getId();
			for(Transition tr:rep.getTransition())
				tr.getId();
			printResult(rep);
		}
	}

	public static void printResult(EObject root) throws IOException {
		ResourceSet rs=new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl()
			);
		rs.getPackageRegistry().put(DtPackage.eNS_URI, DtPackage.eINSTANCE);
		Resource resPrint=rs.createResource(URI.createURI("http://testuri"));
		resPrint.getContents().add(root);
		resPrint.save(System.out, Collections.EMPTY_MAP);
	}
	
	public static void printResultOnFile(String path,EObject root) throws IOException{
		ResourceSet rs=new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl()
			);
		
		Resource resPrint=rs.createResource(URI.createFileURI(path));
		resPrint.getContents().add(root);
		resPrint.save(Collections.EMPTY_MAP);
		
		if(root instanceof EPackage)
			printMetaStat(resPrint);
		
	}
	
	
	
	public static class SampleAnalysisException extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SampleAnalysisException(String message){
			super(message);
		}
		
	}
	
	public static SampleAnalysisException raiseException(String message){
		return new SampleAnalysisException(message);
	}
	
	public static boolean isForAPI(String fullName){
		for(int i=0;i<API_PACKAGE.length;i++)
			if(fullName.startsWith(API_PACKAGE[i]))
				return true;
		return false;
	}
	
	public static void printMetaStat(Resource res){
		int clazz=0;
		int ref=0;
		int attr=0;
		
		for(Iterator it=res.getAllContents();it.hasNext();){
			Object ob=it.next();
			if(ob instanceof EClassifier)
				clazz++;
			else if(ob instanceof EAttribute)
				attr++;
			else if(ob instanceof EReference)
				ref++;
			
		}
		
		System.out.println(String.format("class: %d, attribute: %d, reference: %d",
				clazz,attr,ref));
		
	}

}
