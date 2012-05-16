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

public class TestJOnAS extends TestCase {
	
	public void testHandleClassInstance() throws IOException, JavaModelException{
		//ASTNode node=SourceSampleUtil.getInitialASTRoot("jvm-mouse","src/cn/edu/pku/jmxmouse/CopyOfJMXClient.java");
		
		
		ASTNode node=SourceSampleUtil.getInitialASTRoot("jonastest","src/org/objectweb/j2eemanagement/servlets/MgmtServlet.java");
		
		this.assertNotNull(node);
		ClassDeclarationVisitor visitor=new ClassDeclarationVisitor();
		node.accept(visitor);
		List<Repository> result=visitor.getResult();	
		
//		SourceSampleUtil.printRepResult(result);
		Repository entry=null;
		for(Repository rep:result)
			if(rep.getMethod().getElementName().endsWith("doViewInit"))
				entry=rep;
		
		new Combinator(result,entry).combine();;
		
		
//		SourceSampleUtil.printResult(entry);
		
		MetaConstructor mc=new MetaConstructor("Test","http://mytest3");
		mc.parse(entry);
		
		EPackage res=mc.getResult();
		
		MetaConstructUtil.simplify(res);
		
		SourceSampleUtil.printResultOnFile("D:\\work\\APILearning\\testdata\\result-short.ecore",res);
	}

}
