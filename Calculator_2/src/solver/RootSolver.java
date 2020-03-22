package solver;

import java.util.*;

import exception.RootMinusException;
import expression.TerminalExpression;
import expression.unary.*;

public class RootSolver extends Solver{

	/**
	 * Class RootSolver 
	 * untuk menyelesaikan semua operasi akar
	 */
	
	/**
	 * Constructor pembentuk RootSolver
	 */
	public RootSolver() {}

	/**
	 * Method untuk menyelesaikan semua operasi akar
	 * 
	 * @param input (List yang akan diselesaikan)
	 * @throws Exception (throw RootMinusException)
	 */
	@Override
	public void solve(ArrayList<String> input) throws Exception{
		
		double num_after;
		RootExpression root;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("√")) {
				for(int j = i+1; j < input.size(); j++) {
					if(input.get(j).length() > 0) {
						if(this.isNumber(input.get(j).charAt(input.get(i).length()-1))) {
							num_after = Double.parseDouble(input.get(j));
							root = new RootExpression(new TerminalExpression(num_after));
							num_after = root.solve();
							if(num_after < 0) {
								throw new RootMinusException();
							}
							input.set(j, String.valueOf(num_after));
							break;
						}						
					}
				}
				input.set(i, "");
			}
		}
		
	}
}
