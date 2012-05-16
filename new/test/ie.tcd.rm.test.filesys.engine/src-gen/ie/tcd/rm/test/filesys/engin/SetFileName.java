package ie.tcd.rm.test.filesys.engin;

import ie.tcd.rm.test.filesys.engin.JavaFileAPI;
import ie.tcd.test.filesys.EFile;
import java.io.File;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@Aspect
public class SetFileName {
  private EFile file = null;
  
  private String newName = null;
  
  public JavaFileAPI apiRoot;
  
  public boolean _operation_SET_EFile_name(final EFile element, final EStructuralFeature feature, final Object value) {
    try{
    	
    	boolean _xblockexpression = false;
    	{
    	  this.file = element;
    	  this.newName = ((String) value);
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
  
  @Before("execution(* *.eSet(EStructuralFeature,Object)) && target(elem) &&  args(feature,value) && (!cflow(call(* ie.tcd.rm.test.filesys.engin.*._operation_*(*,*,*))))")
  public void _listen__operation_SET_EFile_name(final EFile elem, final EStructuralFeature feature, final Object value) {
    if(elem.eResource()==null)
    	return;
    apiRoot = JavaFileAPI.resolveInstance(elem.eResource());
    _operation_SET_EFile_name(elem, feature, value);						
  }
  
  public boolean precondition() {
    return true;
  }
  
  public void postcondition() {
  }
  
  public void invoke() throws Exception {
      String _fullPath = JavaFileAPI.getFullPath(this.file);
      File _file = new File(_fullPath);
      final File oriFile = _file;
      String _parent = oriFile.getParent();
      String _operator_plus = StringExtensions.operator_plus(_parent, "\\");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, this.newName);
      File _file_1 = new File(_operator_plus_1);
      oriFile.renameTo(_file_1);
  }
}
