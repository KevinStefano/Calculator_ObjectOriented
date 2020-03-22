package checker;

import exception.OperatorOperatorException;
import exception.StartOperandException;
import exception.EndOperandException;

public class OperatorOperatorChecker extends Checker{
	
	public OperatorOperatorChecker() {}
	
	public void check(String input) throws Exception{
		for(int i = 0; i < input.length(); i++) {
			if(i == input.length()-1) {
				if(isOperand(input.charAt(i)) || isRoot(input.charAt(i))) {
					throw new EndOperandException();
				}
			}
			else if(i == 0) {
				if(isNotMinus(input.charAt(i))) {
					throw new StartOperandException();
				}
			}
			else {
				if(isNotMinus(input.charAt(i))) {
					if(isNotMinus(input.charAt(i+1))) {
						throw new OperatorOperatorException();
					}
				}				
			}
		}
	}
}
