package ie.tcd.rm.test.filesys.engine.actions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import ie.tcd.test.filesys.impl.*;

import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.ecore.EStructuralFeature;

@Aspect
public class TestAspects {

	//@Before("call(* *.getSubfiles())")
	public void testAspect(){
		System.out.println("Got you");
	}
	
	//@Before("execution(* *.eSet(EStructuralFeature,Object))")
	public void testAspectEGet(){
		System.out.println("Got you eSet");
	}
	
	//@Before("call(* *.addAllUnique(..))")
	public void testAspectAdd(){
		System.out.println("Got you Add ");
	}
	
	
}
