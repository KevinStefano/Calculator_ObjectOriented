package checker;

import exception.EndOperandException;
import exception.OperatorOperatorException;
import exception.StartOperandException;

public class MinusMinusChecker extends Checker{
	
	/**
	 * Class MinusMinusChecker 
	 * untuk melakukan pengecekan apakah ada inputan yang memiliki "--" pada angkanya
	 */

	/**
	 * Constructor untuk membuat MinusMinusChecker
	 */
	public MinusMinusChecker() {}
	
	/**
	 * Method check untuk melakukan pengecekan apakah ada
	 * inputan yang memiliki "--" pada angkanya
	 * 
	 * @param s (input yang akan dicek)
	 * @throws Exception (melakukan throw EndOperandException,
	 * 						atau StartOperandException,
	 * 						atau OperatorOperatorException)
	 */
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
