package checker;

import exception.OperatorOperatorException;

public class RootOperatorChecker extends Checker{
	
	public RootOperatorChecker() {}
	
	public void check(String input) throws Exception{
		for(int i = 0; i < input.length() - 1; i++) {
			if(isRoot(input.charAt(i))) {
				if(isMinusUnary(input.charAt(i+1))) {
					throw new RootOperatorException();
				}
			}
		}
	}
}
