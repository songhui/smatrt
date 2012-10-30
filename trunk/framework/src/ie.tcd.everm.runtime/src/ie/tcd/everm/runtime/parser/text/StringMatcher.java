package ie.tcd.everm.runtime.parser.text;

public class StringMatcher extends ValueMatcher<String> {

	protected String s = null;
	@Override
	public String getValue() {
		return s;
	}

	@Override
	public boolean matche(String s) {
		this.s = s;
		return true;
	}

}
