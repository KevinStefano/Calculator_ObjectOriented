package checker;

import exception.AnsAnsException;

public class AnsAnsChecker extends Checker{

	/**
	 * Class AnsAnsChecker 
	 * untuk mengecek String pada layar terdapat ansans 
	 */
	
	/**
	 * Constructor untuk membuat AnsAnsChecker
	 */
	public AnsAnsChecker() {}
	
	/**
	 * Class untuk mengecek apakah inputan
	 * terdapat substring "ansans"
	 * 
	 * @param s (Input String yang akan dicek)
	 */
	public void check(String s) throws Exception {
		if(s.contains("ansans")) {
			throw new AnsAnsException();
		}
	}
}
