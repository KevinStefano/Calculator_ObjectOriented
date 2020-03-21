package solver;

import java.util.*;
import expression.unary.UnaryExpression;
import expression.unary.SinExpression;
import expression.unary.TanExpression;
import expression.unary.CosExpression;
import expression.TerminalExpression;

public class TrigonoParser extends Solver{

	public TrigonoParser() {}
	
	public void solve(ArrayList<String> input) {
		
		double num_after;
		
		UnaryExpression trigono;
		
		for(int i = input.size()-1; i >= 0; i--) {
			if(input.get(i).equals("sin") || input.get(i).equals("cos") || input.get(i).equals("tan")) {
				for(int j = i; j < input.size(); j++) {
					if(input.get(j).length() > 0) {
						if(this.isNumber(input.get(j).charAt(0))) {
							num_after = Double.parseDouble(input.get(j));
							if(input.get(i).equals("sin")) {
								trigono = new SinExpression(new TerminalExpression(num_after));
							}
							else if(input.get(i).equals("cos")) {
								trigono = new CosExpression(new TerminalExpression(num_after));
							}
							else {
								trigono = new TanExpression(new TerminalExpression(num_after));
							}
							num_after = trigono.solve();
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
