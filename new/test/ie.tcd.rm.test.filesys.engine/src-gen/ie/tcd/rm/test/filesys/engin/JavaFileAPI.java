package ie.tcd.rm.test.filesys.engin;

import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import java.io.File;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class JavaFileAPI {
  public static String getFullPath(final EFile file) {
    String _xifexpression = null;
    boolean _operator_equals = ObjectExtensions.operator_equals(file, null);
    if (_operator_equals) {
      _xifexpression = "";
    } else {
      EFolder _parent = file.getParent();
      String _fullPath = JavaFileAPI.getFullPath(_parent);
      String _operator_plus = StringExtensions.operator_plus(_fullPath, "\\");
      String _name = file.getName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
      _xifexpression = _operator_plus_1;
    }
    return _xifexpression;
  }
  
  public boolean checkEFileForEFolder(final File core) {
    boolean _isDirectory = core.isDirectory();
    return _isDirectory;
  }
  
  public EFile createEFile(final File core) {
    String mTypeName = "EFile";
    if(checkEFileForEFolder(core))
    	mTypeName = "EFolder";
    for(EObject obj : _instPool.keySet())
    	if(_instPool.get(obj).equals(core))
    		return (EFile)obj;
    org.eclipse.emf.ecore.EPackage epackage = resource.getAllContents().next().eClass().getEPackage();
    EFile ins = (EFile)epackage.getEFactoryInstance().create((org.eclipse.emf.ecore.EClass)epackage.getEClassifier(mTypeName));
    ins.eAdapters().add(JavaFileAPIAdapter.INSTANCE);
    initEFile(ins, core);
    _instPool.put(ins,core);
    return ins;
  }
  
  public void initEFile(final EFile element, final File core) {
    String _name = core.getName();
    element.setName(_name);
  }
  
  private static Map<Resource,JavaFileAPI> instances =  new java.util.HashMap<Resource,JavaFileAPI>();
  
  private Resource resource = null;
  
  public static JavaFileAPI resolveInstance(final Resource resource) {
    JavaFileAPI result = instances.get(resource);
    if(result!=null)
    	return result;
    result = new JavaFileAPI();
    result.resource = resource;
    instances.put(resource,result);
    for(Object o:resource.eAdapters())
    	if(o instanceof JavaFileAPIAdapter)
    		return result;
    resource.eAdapters().add(JavaFileAPIAdapter.INSTANCE);
    return result;
  }
  
  private Map<EObject,Object> _instPool = new java.util.HashMap<EObject,Object>();
}
