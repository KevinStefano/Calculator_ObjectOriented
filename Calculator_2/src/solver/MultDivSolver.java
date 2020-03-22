package solver;

import java.util.*;

import exception.DivideByZeroException;
import expression.TerminalExpression;
import expression.binary.MultiplyExpression;
import expression.binary.DivideExpression;

public class MultDivSolver extends Solver{
	
	public MultDivSolver() {}
	
	@Override
	public void solve(ArrayList<String> input) throws Exception{
		
		double num_before = 0;
		double num_after = 0;
		
		MultiplyExpression mult;
		DivideExpression divide;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("*") || input.get(i).equals("/")) {
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
							if(input.get(i).equals("*")) {
								mult = new MultiplyExpression(new TerminalExpression(num_before), new TerminalExpression(num_after));
								num_before = mult.solve();
							}
							else {
								if(num_after == 0) {
									throw new DivideByZeroException();
								}
								divide = new DivideExpression(new TerminalExpression(num_before), new TerminalExpression(num_after));
								num_before = divide.solve();
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
