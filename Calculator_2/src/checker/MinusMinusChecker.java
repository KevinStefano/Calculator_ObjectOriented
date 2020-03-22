package checker;

import exception.EndOperandException;
import exception.OperatorOperatorException;
import exception.StartOperandException;

public class MinusMinusChecker extends Checker{

	public MinusMinusChecker() {}
	
	public void check(String input) throws Exception {
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '-') {
				try {
					input.charAt(i+1);
				}
				catch(Exception e) {
					throw new EndOperandException();
				}
				if(input.charAt(i+1) == '-') {
					if(i == 0) {
						throw new StartOperandException();
					}
					else {
						if(isOperand(input.charAt(i-1))) {
							throw new OperatorOperatorException();
						}
					}
				}
			}
		}
	}
}
