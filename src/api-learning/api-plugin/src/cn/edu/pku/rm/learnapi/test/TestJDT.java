package cn.edu.pku.rm.learnapi.test;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

import junit.framework.TestCase;

public class TestJDT extends TestCase {
	
	
	
	public void testStart() throws JavaModelException{
		IProject prj=ResourcesPlugin.getWorkspace()
			.getRoot().getProject("jvm-mouse");
		
		IPath path=new Path("src/com/wrox/projavaserver14/chapter19/jsr77/JVMMonitor.java");
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
		
		TypeDeclaration type=(TypeDeclaration)((CompilationUnit)astNode).types().get(0);		
		MethodDeclaration main=type.getMethods()[0];
		List statements=main.getBody().statements();
		
		VariableDeclarationStatement vds=(VariableDeclarationStatement)statements.get(0);
		ExpressionStatement es=(ExpressionStatement)statements.get(1);
		
		SimpleName name1=((VariableDeclarationFragment)vds.fragments().get(0)).getName();
		
		Assignment ass=(Assignment)es.getExpression();
		
		SimpleName name2=(SimpleName)((Assignment)es.getExpression()).getLeftHandSide();
		
		IJavaElement[] elements=src.codeSelect(name1.getStartPosition(), name1.getLength());
		
		IJavaElement[] elements2=src.codeSelect(name2.getStartPosition(), name2.getLength());
		
		IJavaElement[] stats1=src.codeSelect(es.getStartPosition(),es.getLength());
		
		IBinding bd1=name1.resolveBinding();
		IBinding bd2=name2.resolveBinding();
		
		//bd2=es.getExpression().re
		
		assertEquals(elements[0],elements2[0]);
		
		
		
		
		//assertNotNull(astNode);

	}

}
