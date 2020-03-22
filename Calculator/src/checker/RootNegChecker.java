package checker;

import exception.RootMinusException;

public class RootNegChecker extends Checker{
	
	/**
	 * Class RootNegChecker 
	 * untuk melakukan pengecekan apakah terdapat 
	 * akar negatif
	 */
	
	/**
	 * Constructor untuk membuat RootNegChecker
	 */
	public RootNegChecker() {}
	
	/**
	 * Method check untuk melakukan pengecekan terhadap
	 * String apakah terdapat akar negatif
	 * 
	 * @param input (String yang akan dicek)
	 * @throws Exception (Melakukan throw OperatorOperatorException)
	 */
	public void check(String input) throws Exception{
		for(int i = 0; i < input.length() - 1; i++) {
			if(isRoot(input.charAt(i))) {
				if(isMinusUnary(input.charAt(i+1))) {
					throw new RootMinusException();
				}
			}
		}
	}
}
