package solver;

import java.util.*;
import expression.TerminalExpression;
import expression.binary.AddExpression;
import expression.binary.SubstractExpression;

public class AddSubSolver extends Solver{
	
	/**
	 * Class AddSubSolver 
	 * untuk menyelesaikan penjumlahan dan pengurangan
	 */

	/**
	 * Constructor pembentuk AddSubSolver
	 */
	public AddSubSolver() {}
	
	/**
	 * Method untuk menyelesaikan penjumlahan dan pengurangan
	 * 
	 * @param input (List yang akan diselesaikan)
	 */
	@Override
	public void solve(ArrayList<String> input) {
		
		double num_before = 0;
		double num_after = 0;
		
		AddExpression add;
		SubstractExpression sub;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("+") || input.get(i).equals("-")) {
				for(int j = i+1; j < input.size(); j++) {
					if(input.get(j).length() > 0) {
						if(this.isNumber(input.get(j).charAt(input.get(j).length()-1))) {
							num_after = Double.parseDouble(input.get(j));
							input.set(j, "");
							break;
						}						
					}
				}
				for(int j = i-1; j >= 0; j--) {
					if(input.get(j).length() > 0) {
						if(this.isNumber(input.get(j).charAt(input.get(j).length()-1))) {
							num_before = Double.parseDouble(input.get(j));
							if(input.get(i).equals("+")) {
								add = new AddExpression(new TerminalExpression(num_before), new TerminalExpression(num_after));
								num_before = add.solve();
							}
							else {
								sub = new SubstractExpression(new TerminalExpression(num_before), new TerminalExpression(num_after));
								num_before = sub.solve();
							}
							input.set(j, String.valueOf(num_before));
							break;
						}
					}
				}
				input.set(i, "");
			}
		}	
	}
}
