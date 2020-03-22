package checker;

import java.util.ArrayList;

public class CheckAll {
	
	/**
	 * Class CheckAll 
	 * untuk melakukan pengecekan secara menyeluruh 
	 * apakah String inputan valid atau tidak
	 */
	
	/**
	 * Constructor untuk membuat CheckAll
	 */
	public CheckAll() {}
	
	/**
	 * Method check untuk melakukan pengecekan secara
	 * menyeluruh terhadap string inputan apakah
	 * string tersebut valid atau tidak
	 * 
	 * @param input (String input yang akan dicek)
	 * @throws Exception throw exception yang berasal dari class Checker
	 */
	public void check(String input) throws Exception{
		ArrayList<Checker> check = new ArrayList<Checker>();
		check.add(new AnsAnsChecker());
		check.add(new DoubleDotChecker());
		check.add(new MinusMinusChecker());
		check.add(new NumberRootChecker());
		check.add(new OperatorOperatorChecker());
		check.add(new RootOperatorChecker());
		check.add(new TrigonomChecker());
		
		for(int i = 0; i < check.size(); i++) {
			try {
				check.get(i).check(input);
			}
			catch(Exception e) {
				throw(e);
			}
		}
	}
}
