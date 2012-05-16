package JOnAS.test;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import cn.edu.pku.sei.ra.util.ECoreRelatedUtil;

import JOnAS.JOnASFactory;
import JOnAS.JOnASPackage;
import JOnAS.MBeanServer;
import JOnAS.WebModule;

import junit.framework.TestCase;

public class TestGenerated extends TestCase {
	
	public void testReadAll() throws IOException{
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(JOnASPackage.eNS_URI, 
			 JOnASPackage.eINSTANCE);
		
		Resource rs=resourceSet.createResource(URI.createFileURI("test.jonas"));
		MBeanServer ms=JOnASFactory.eINSTANCE.createMBeanServer();
		ECoreRelatedUtil.refreshEObject(ms);
		rs.getContents().add(ms);
		rs.save(System.out,Collections.EMPTY_MAP);
		WebModule wb=JOnASFactory.eINSTANCE.createWebModule();
		wb.setName("//localhost/rss");
		wb.setFileName("rss.war");
		ms.getWebModule().add(wb);
		rs.save(System.out,Collections.EMPTY_MAP);
	}

}
