package ie.tcd.rm.test.filesys.engin;

import ie.tcd.rm.test.filesys.engin.JavaFileAPI;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import java.io.File;
import java.util.List;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect
public class ListSubFiles {
  private EFolder parent = null;
  
  public JavaFileAPI apiRoot;
  
  public boolean _operation_GET_EFolder_subfiles(final EFolder element, final EStructuralFeature feature, final Object value) {
    try{
    	
    	boolean _xblockexpression = false;
    	{
    	  this.parent = element;
    	  _xblockexpression = (true);
    	}
    	if(!_xblockexpression)
    		return false;
    	if(!precondition())
    		return false;
    	List<File> result = invoke();
    	List<EFile> res = new java.util.ArrayList<EFile>();
    	for(Object r : result){
    		res.add(apiRoot.createEFile((File)r));
    	}
    	postcondition(res);
    	return true;
    }
    catch(Exception e){
    	e.printStackTrace();
    	return false;
    }
  }
  
  @Before("call(* *.eGet(EStructuralFeature,boolean)) && target(elem) &&  args(feature,*) && (!cflow(call(* ie.tcd.rm.test.filesys.engin.*._operation_*(*,*,*))))")
  public void _listen__operation_GET_EFolder_subfiles(final EFolder elem, final EStructuralFeature feature) {
    apiRoot = JavaFileAPI.resolveInstance(elem.eResource());
    _operation_GET_EFolder_subfiles(elem, feature, null);
    
  }
  
  public boolean precondition() {
    return true;
  }
  
  public void postcondition(final List<EFile> subs) {
      EList _subfiles = this.parent.getSubfiles();
      _subfiles.clear();
      EList _subfiles_1 = this.parent.getSubfiles();
      _subfiles_1.addAll(subs);
  }
  
  public List<File> invoke() throws Exception {
    List<File> _xblockexpression = null;
    {
      String _fullPath = JavaFileAPI.getFullPath(this.parent);
      File _file = new File(_fullPath);
      final File file = _file;
      File[] _listFiles = file.listFiles();
      List<File> _list = IterableExtensions.<File>toList(((Iterable<? extends File>)Conversions.doWrapArray(_listFiles)));
      _xblockexpression = (_list);
    }
    return _xblockexpression;
  }
}
