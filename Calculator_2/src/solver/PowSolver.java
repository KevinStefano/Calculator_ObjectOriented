package solver;

import java.util.*;
import expression.TerminalExpression;
import expression.binary.PowerExpression;

public class PowSolver extends Solver{

	public PowSolver() {}

	@Override
	public void solve(ArrayList<String> input) {
		
		double num_before = 0;
		double num_after = 0;
		
		PowerExpression pow;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("^")) {
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
							pow = new PowerExpression(new TerminalExpression(num_before), new TerminalExpression(num_after));
							num_before = pow.solve();
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
