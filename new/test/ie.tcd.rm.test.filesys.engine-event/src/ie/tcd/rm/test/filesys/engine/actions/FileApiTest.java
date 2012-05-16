package ie.tcd.rm.test.filesys.engine.actions;

import ie.tcd.test.filesys.EFolder;
import ie.tcd.test.filesys.FileSysFactory;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class FileApiTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());
		
		try {
			Resource resource = resourceSet.createResource(URI.createURI("http:///My.filesys"));
			EFolder root = FileSysFactory.eINSTANCE.createEFolder();
			resource.getContents().add(root);
			
			root.setName("C:\\scltest");
			
			System.out.println(root.getSubfiles());
			
			resource.save(System.out, null);
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
