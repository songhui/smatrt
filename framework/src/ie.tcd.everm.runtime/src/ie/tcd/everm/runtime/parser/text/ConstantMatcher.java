package ie.tcd.everm.runtime.parser.text;

public class ConstantMatcher extends Matcher {

	protected String constant = null;
	
	public ConstantMatcher(String constant){
		this.constant = constant;
	}
	@Override
	public boolean matche(String s) {
		return constant.equals(s);
	}

}
