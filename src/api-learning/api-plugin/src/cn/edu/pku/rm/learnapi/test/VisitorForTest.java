package cn.edu.pku.rm.learnapi.test;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;

public class VisitorForTest extends ASTVisitor {

	public VisitorForTest() {
		// TODO Auto-generated constructor stub
	}

	public VisitorForTest(boolean visitDocTags) {
		super(visitDocTags);
		// TODO Auto-generated constructor stub
	}
	
	public boolean visit(Assignment node){
		return true;
	}

}
