package ie.tcd.rm.test.filesys.engin;

import java.util.List;

public class CreateFileParser {
  public String path = null;
  
  public String op = null;
  
  public boolean parse(final String stringText) {
    try{
    	List<String> text = format(stringText);
    	 this.path = text.get(2); 
    	 this.op = text.get(3); 
    	return true;
    }catch(Exception e){
    	System.err.println(e.getMessage());return false;
    }
  }
  
  public List<String> format(final String text) {
    return java.util.Arrays.asList(text.split(","));
  }
}
