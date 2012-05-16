package ie.tcd.rm.test.filesys.engin;

import ie.tcd.everm.runtime.event.AbstractEvent;
import ie.tcd.rm.test.filesys.engin.CreateFileParser;
import ie.tcd.rm.test.filesys.engin.FileChanges;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import ie.tcd.test.filesys.FileSysFactory;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

public class CreateFile extends AbstractEvent {
  private Map<String,EObject> context =  null;
  
  private EFolder root = null;
  
  private EFolder folder = null;
  
  private CreateFileParser parser = new CreateFileParser();
  
  public void init(final Map<String,EObject> context) {
    this.context = context;
    this.root = null;
    for(String key : context.keySet())
    	if("root".equals(key))
    		this.root = (EFolder)context.get("root");
    
    this.folder = null;
    for(String key : context.keySet())
    	if("folder".equals(key))
    		this.folder = (EFolder)context.get("folder");
    
  }
  
  public boolean calcuVariables() {
    for(int i=0; i<2; i++){
    try{
    	
    	boolean _operator_equals = ObjectExtensions.operator_equals("created", this.parser.op);
    	if(!_operator_equals)
    		return false;
    }
    catch(NullPointerException e){ }
    try{
    	if(folder==null){
    		
    		EFolder _containerByPath = FileChanges.getContainerByPath(this.root, this.parser.path);
    		EFolder _folder = this.folder = _containerByPath;
    	}
    }
    catch(NullPointerException e){ }
    }
    for(int i=0;i<0;i++){
    }
    return true;
  }
  
  public boolean _execute(final String text) {
    if(!parser.parse(text))
    	return false;
    if(!calcuVariables())
    	return false;
    postcondition();
    return true;
  }
  
  public boolean execute(final Object event) {
    return _execute((String)event);
  }
  
  public void postcondition() {
      String _extractFileName = FileChanges.extractFileName(this.parser.path);
      final String name = _extractFileName;
      EFile _xifexpression = null;
      boolean _contains = name.contains("folder");
      if (_contains) {
        EFolder _createEFolder = FileSysFactory.eINSTANCE.createEFolder();
        _xifexpression = _createEFolder;
      } else {
        EFile _createEFile = FileSysFactory.eINSTANCE.createEFile();
        _xifexpression = _createEFile;
      }
      final EFile file = _xifexpression;
      file.setName(name);
      EList _subfiles = this.folder.getSubfiles();
      CollectionExtensions.<EFile>operator_add(_subfiles, file);
  }
}
