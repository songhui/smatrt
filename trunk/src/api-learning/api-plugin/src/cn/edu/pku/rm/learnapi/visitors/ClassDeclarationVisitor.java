/**
 * 
 */
package cn.edu.pku.rm.learnapi.visitors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import cn.edu.pku.sei.ra.dt.Repository;

/**
 * @author hubert
 *
 */
public class ClassDeclarationVisitor extends ASTVisitor {
	
	List<Repository> reps=new ArrayList<Repository>();
	
	public boolean visit(MethodDeclaration node){
		try{
		if(node.getBody().statements().isEmpty()){
			return false;
		}
		}catch(NullPointerException e){
			return false;
		}
		MethodDeclarationVisitor visitor=new MethodDeclarationVisitor();
		node.accept(visitor);
		reps.add(visitor.getResult());
		return false;
	}
	
	public List<Repository> getResult(){
		return reps;
	}

}
