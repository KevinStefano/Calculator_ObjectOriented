package checker;

import exception.AnsAnsException;

public class AnsAnsChecker {

	public AnsAnsChecker() {}
	
	public void check(String s) throws Exception {
		if(s.contains("ansans")) {
			throw new AnsAnsException();
		}
	}
}
