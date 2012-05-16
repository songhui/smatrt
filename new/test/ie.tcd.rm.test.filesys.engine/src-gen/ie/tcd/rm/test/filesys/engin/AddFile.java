package ie.tcd.rm.test.filesys.engin;

import ie.tcd.rm.test.filesys.engin.JavaFileAPI;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import java.io.File;
import org.aspectj.lang.annotation.Aspect;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@Aspect
public class AddFile {
  private String parent = null;
  
  private String newName = null;
  
  private boolean isDir;
  
  public JavaFileAPI apiRoot;
  
  public boolean _operation_ADD_EFolder_subfiles(final EFolder element, final EStructuralFeature feature, final Object value) {
    try{
    	
    	boolean _xblockexpression = false;
    	{
    	  String _fullPath = JavaFileAPI.getFullPath(element);
    	  this.parent = _fullPath;
    	  String _name = ((EFile) value).getName();
    	  this.newName = _name;
    	  this.isDir = (value instanceof EFolder);
    	  _xblockexpression = (true);
    	}
    	if(!_xblockexpression)
    		return false;
    	if(!precondition())
    		return false;
    	invoke();
    	postcondition();
    	return true;
    }
    catch(Exception e){
    	e.printStackTrace();
    	return false;
    }
  }
  
  public void _listen__operation_ADD_EFolder_subfiles() {
    throw new UnsupportedOperationException("_listen__operation_ADD_EFolder_subfiles is not implemented");
  }
  
  public boolean precondition() {
    return true;
  }
  
  public void postcondition() {
  }
  
  public void invoke() throws Exception {
      String _operator_plus = StringExtensions.operator_plus(this.parent, "\\");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, this.newName);
      File _file = new File(_operator_plus_1);
      final File newFile = _file;
      if (this.isDir) {
        newFile.mkdir();
      } else {
        newFile.createNewFile();
      }
  }
}
