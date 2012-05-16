package cn.edu.pku.rm.learnapi.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

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

public class TestBCEL extends TestCase {
	
	public void testHandleClassInstance() throws IOException, JavaModelException{
		//ASTNode node=SourceSampleUtil.getInitialASTRoot("jvm-mouse","src/cn/edu/pku/jmxmouse/CopyOfJMXClient.java");
		
		SourceSampleUtil.API_PACKAGE=new String[]{
				"org.apache.bcel"
		};
		
		ASTNode node=SourceSampleUtil.getInitialASTRoot("bceltest","src/be/ac/vub/jar2uml/JarToUML.java");
		ClassDeclarationVisitor visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		List<Repository> result=visitor.getResult();	
		
		node=SourceSampleUtil.getInitialASTRoot("bceltest","src/be/ac/vub/jar2uml/JarToUMLOperation.java");
		visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		result.addAll(visitor.getResult());
		
		node=SourceSampleUtil.getInitialASTRoot("bceltest","src/be/ac/vub/jar2uml/AddClassifiers.java");
		visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		result.addAll(visitor.getResult());
		
		node=SourceSampleUtil.getInitialASTRoot("bceltest","src/be/ac/vub/jar2uml/AddProperties.java");
		visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		result.addAll(visitor.getResult());
		
		node=SourceSampleUtil.getInitialASTRoot("bceltest","src/be/ac/vub/jar2uml/ParseClasses.java");
		visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		result.addAll(visitor.getResult());
		
		Repository entry=new Combinator(result,"run").combine();
		
		
		entry.clearTemp();
		SourceSampleUtil.printResult(entry);
		
		MetaConstructor mc=new MetaConstructor("Test","http://mytest3");
		mc.parse(entry);
		
		EPackage res=mc.getResult();
		
		
		
		MetaConstructUtil.simplify(res);

		
		SourceSampleUtil.printResultOnFile("D:\\work\\APILearning\\testdata\\result-bcel.ecore",res);
	}

}
