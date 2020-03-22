package checker;

import exception.DoubleDotException;

public class DoubleDotChecker extends Checker{
	
	public DoubleDotChecker() {}
	
	public void check(String s) throws Exception{
		if(s.contains("..")) {
			throw new DoubleDotException();
		}
	}
}
