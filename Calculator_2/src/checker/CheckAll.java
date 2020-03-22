package checker;

import java.util.ArrayList;

public class CheckAll {
	
	public CheckAll() {}
	
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
