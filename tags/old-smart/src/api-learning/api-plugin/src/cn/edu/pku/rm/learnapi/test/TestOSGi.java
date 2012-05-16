package cn.edu.pku.rm.learnapi.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;

import cn.edu.pku.rm.learnapi.Combinator;
import cn.edu.pku.rm.learnapi.SourceSampleUtil;
import cn.edu.pku.rm.learnapi.TraceBuilder;
import cn.edu.pku.rm.learnapi.Tracer;
import cn.edu.pku.rm.learnapi.meta.MetaConstructUtil;
import cn.edu.pku.rm.learnapi.meta.MetaConstructor;
import cn.edu.pku.rm.learnapi.visitors.ClassDeclarationVisitor;
import cn.edu.pku.rm.learnapi.visitors.MethodDeclarationVisitor;
import cn.edu.pku.sei.ra.dt.Repository;

public class TestOSGi extends TestCase {
	
	public void testOSGiConsoles() throws IOException, JavaModelException{
		//ASTNode node=SourceSampleUtil.getInitialASTRoot("jvm-mouse","src/cn/edu/pku/jmxmouse/CopyOfJMXClient.java");
		ASTNode node=SourceSampleUtil.getInitialASTRoot("osgi-test",
				"src/org/eclipse/osgi/framework/internal/core/FrameworkCommandProvider.java");
		SourceSampleUtil.API_PACKAGE=new String[]{
				"org.eclipse.osgi.framework.internal.core",
				"org.osgi.framework.BundleContext",
				"org.osgi.service.packageadmin",
		};
		
		this.assertNotNull(node);
		
		String[] methods=new String[]{
				"_bundle",
				"_bundles",
				"_props",
				"_services",
				"_packages",
				"_threads"
		};
		
		List<EPackage> pkgs=new ArrayList<EPackage>();
		for(int i=0;i<methods.length;i++)
			pkgs.add(getOneRoot(node, methods[i]));
		
		EPackage mainpkg=pkgs.get(0);
		EClass mainroot=(EClass)mainpkg.getEClassifier("Root");
		for(EPackage pkg:pkgs){
			if(pkg==mainpkg)
				continue;
			EClass root=(EClass)pkg.getEClassifier("Root");
			
			mainroot.getEStructuralFeatures().addAll(root.getEStructuralFeatures());
			pkg.getEClassifiers().remove(root);
			mainpkg.getEClassifiers().addAll(pkg.getEClassifiers());
		}
		
		MetaConstructUtil.simplify(mainpkg);
		
		SourceSampleUtil.printResultOnFile("D:\\work\\APILearning\\testdata\\result-osgi-bundle.ecore",mainpkg);
	}

	private EPackage getOneRoot(ASTNode node,String method) throws JavaModelException,
			IOException {
		ClassDeclarationVisitor visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		List<Repository> result=visitor.getResult();	
		
//		SourceSampleUtil.printRepResult(result);
		
		
		Repository entry=new Combinator(result,method).combine();
		
		entry.clearTemp();
		SourceSampleUtil.printResult(entry);
		
		MetaConstructor mc=new MetaConstructor("Test","http://mytest3");
		mc.parse(entry);
		
		EPackage res=mc.getResult();
		return res;
	}
	
	

}
