package checker;

import exception.NumberRootException;

public class NumberRootChecker extends Checker{
	
	/**
	 * Class NumberRootChecker 
	 * untuk melakukan pengecekan terhadap string input, 
	 * apakah terdapat angka dan akar yang berdempetan
	 */

	/**
	 * Constructor untuk membaut NumberRootChecker
	 */
	public NumberRootChecker() {}
	
	/**
	 * Method check untuk melakukan pengecekan terhadap
	 * string input, apakah terdapat angka dan akar
	 * yang berdempetan
	 * 
	 * @param input (string yang akan dicek)
	 * @throws Exception (Melakukan throw NumberRootException)
	 */
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
