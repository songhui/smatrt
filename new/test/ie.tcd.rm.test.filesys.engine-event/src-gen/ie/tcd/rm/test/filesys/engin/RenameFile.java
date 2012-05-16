package ie.tcd.rm.test.filesys.engin;

import ie.tcd.everm.runtime.event.AbstractEvent;
import ie.tcd.rm.test.filesys.engin.FileChanges;
import ie.tcd.rm.test.filesys.engin.RenameFileParser;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;

public class RenameFile extends AbstractEvent {
  private Map<String,EObject> context =  null;
  
  private EFolder root = null;
  
  private EFolder folder = null;
  
  private EFile file = null;
  
  private RenameFileParser parser = new RenameFileParser();
  
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
    
    this.file = null;
    for(String key : context.keySet())
    	if("file".equals(key))
    		this.file = (EFile)context.get("file");
    
  }
  
  public List<EFile> getScope_file() {
    EList _subfiles = this.folder.getSubfiles();
    return _subfiles;
  }
  
  public boolean calcuVariables() {
    for(int i=0; i<3; i++){
    try{
    	
    	boolean _operator_and = false;
    	boolean _startsWith = this.parser.op.startsWith("renamed");
    	if (!_startsWith) {
    	  _operator_and = false;
    	} else {
    	  boolean _contains = this.parser.op.contains("Recycle.Bin");
    	  boolean _operator_not = BooleanExtensions.operator_not(_contains);
    	  _operator_and = BooleanExtensions.operator_and(_startsWith, _operator_not);
    	}
    	if(!_operator_and)
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
    try{
    	if(file==null){
    		List<EFile> scp_file = getScope_file();
    		for(EFile it : scp_file){
    			
    			String _extractFileName = FileChanges.extractFileName(this.parser.path);
    			if(it.getName().equals(_extractFileName)){
    				file = it;
    				break;
    			}  
    		}
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
    String _substring = this.parser.op.substring(11);
    this.file.setName(_substring);
  }
}
