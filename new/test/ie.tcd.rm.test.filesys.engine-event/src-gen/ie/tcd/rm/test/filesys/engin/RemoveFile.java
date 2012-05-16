package ie.tcd.rm.test.filesys.engin;

import ie.tcd.everm.runtime.event.AbstractEvent;
import ie.tcd.rm.test.filesys.engin.FileChanges;
import ie.tcd.rm.test.filesys.engin.RemoveFileParser;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;

public class RemoveFile extends AbstractEvent {
  private Map<String,EObject> context =  null;
  
  private EFolder root = null;
  
  private EFolder folder = null;
  
  private EFile file = null;
  
  private RemoveFileParser parser = new RemoveFileParser();
  
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
    	
    	boolean _operator_or = false;
    	boolean _startsWith = this.parser.op.startsWith("deleted");
    	if (_startsWith) {
    	  _operator_or = true;
    	} else {
    	  boolean _contains = this.parser.op.contains("Recycle.Bin");
    	  _operator_or = BooleanExtensions.operator_or(_startsWith, _contains);
    	}
    	if(!_operator_or)
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
    EList _subfiles = this.folder.getSubfiles();
    _subfiles.remove(this.file);
  }
}
