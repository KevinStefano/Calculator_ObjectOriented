package checker;

import exception.DoubleDotException;

public class DoubleDotChecker extends Checker{
	
	/**
	 * Class DoubleDotChecker 
	 * untuk mengecek apakah pada suatu string terdapat substring ".."
	 */
	
	/**
	 * Constructor untuk membuat DoubleDotChecker
	 */
	public DoubleDotChecker() {}
	
	/**
	 * Melakukan pengecekan apakah dalam suatu string
	 * terdapat substring ".."
	 * 
	 * @param s (input yang akan dicek)
	 * @throws Exception (Melakukan throw DoubleDotException)
	 */
	public void check(String s) throws Exception{
		if(s.contains("..")) {
			throw new DoubleDotException();
		}
	}
}
