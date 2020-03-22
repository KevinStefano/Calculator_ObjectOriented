package checker;

import exception.NumberRootException;

public class NumberRootChecker extends Checker{

	public NumberRootChecker() {}
	
	public void check(String input) throws Exception{
		for(int i = 0; i < input.length()-1; i++) {
			if(isNumber(input.charAt(i))) {
				if(isRoot(input.charAt(i+1))) {
					throw new NumberRootException();
				}
			}
		}
	}
}
