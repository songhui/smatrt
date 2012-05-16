package cn.edu.pku.sei.ra.wrapping.codegen.test;

import cn.edu.pku.sei.ra.wrapping.codegen.util.GenEnvironment;
import junit.framework.TestCase;

public class TestPreProc extends TestCase {
	
	public void testRegx(){
		System.out.println("\t\t afti \t ff\n \t  f f f\t".trim());
		String s="Management mainEntry=$global.getMainEntry();" +
				"try {" +
				"$feature_name=(String)mainEntry.getAttribute($core, \"$feature_name\");" +
				"} catch (Exception e) {" +
				"e.printStackTrace();" +
				"}";
		s=s.replaceAll("[$]feature_name", "heihei");
		System.out.println(s);
	}

}
