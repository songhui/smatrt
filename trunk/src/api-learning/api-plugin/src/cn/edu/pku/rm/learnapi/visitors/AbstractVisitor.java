package cn.edu.pku.rm.learnapi.visitors;

import org.eclipse.jdt.core.dom.ASTVisitor;

import cn.edu.pku.sei.ra.dt.DtFactory;
import cn.edu.pku.sei.ra.dt.Repository;

public abstract class AbstractVisitor extends ASTVisitor {

	protected Repository repository = null;
	protected DtFactory factory = null;
	
	public AbstractVisitor(){
		factory=DtFactory.eINSTANCE;
	}

	public AbstractVisitor(Repository repository) {
		this.repository=repository;
		factory=DtFactory.eINSTANCE;
	}

	public AbstractVisitor(boolean visitDocTags) {
		super(visitDocTags);
	}

}