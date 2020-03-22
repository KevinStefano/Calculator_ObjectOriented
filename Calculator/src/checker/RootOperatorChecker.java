package checker;

import exception.OperatorOperatorException;

public class RootOperatorChecker extends Checker{
	
	/**
	 * Class RootOperatorChecker 
	 * untuk melakukan pengecekan apakah terdapat 
	 * akar dan binary operator yang berdempetan
	 */
	
	/**
	 * Constructor untuk membuat RootOperatorChecker
	 */
	public RootOperatorChecker() {}
	
	/**
	 * Method check untuk melakukan pengecekan terhadap
	 * String apakah terdapat akar dan operator yang berdempetan
	 * 
	 * @param input (String yang akan dicek)
	 * @throws Exception (Melakukan throw OperatorOperatorException)
	 */
	public void check(String input) throws Exception{
		for(int i = 0; i < input.length() - 1; i++) {
			if(isRoot(input.charAt(i))) {
				if(isNotMinus(input.charAt(i+1))) {
					throw new OperatorOperatorException();
				}
			}
		}
	}
}
