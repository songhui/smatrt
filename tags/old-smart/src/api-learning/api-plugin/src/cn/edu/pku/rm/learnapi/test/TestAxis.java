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

public class TestAxis extends TestCase {
	
	public void testHandleClassInstance() throws IOException, JavaModelException{
		//ASTNode node=SourceSampleUtil.getInitialASTRoot("jvm-mouse","src/cn/edu/pku/jmxmouse/CopyOfJMXClient.java");
		
		SourceSampleUtil.API_PACKAGE=new String[]{
				"org.w3c.dom"
		};
		
		ASTNode node=SourceSampleUtil.getInitialASTRoot("apache","src/org/apache/axis/utils/Admin.java");
		ClassDeclarationVisitor visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		List<Repository> result=visitor.getResult();	
		
		
		
		Repository entry=new Combinator(result,"process").combine();
		
		
		entry.clearTemp();
		SourceSampleUtil.printResult(entry);
		
		MetaConstructor mc=new MetaConstructor("Test","http://mytest3");
		mc.parse(entry);
		
		EPackage res=mc.getResult();
		
		
		
		MetaConstructUtil.simplify(res);

		
		SourceSampleUtil.printResultOnFile("D:\\work\\APILearning\\testdata\\result-vod.ecore",res);
	}

}
