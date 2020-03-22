package solver;

import java.util.*;
import expression.TerminalExpression;
import expression.unary.*;

public class NegativeSolver extends Solver{
	
	public NegativeSolver() {}

	@Override
	public void solve(ArrayList<String> input) {
		
		double num_after;
		NegativeExpression neg;
		boolean found = true;
		
		for(int i = 0; i < input.size(); i++) {
			
			// Case - di awal
			if(i == 0 && input.get(i).equals("-")) {
				for(int j = i+1; j < input.size(); j++) {
					if(input.get(j).length() > 0) {
						if(this.isNumber(input.get(j).charAt(0))) {
							num_after = Double.parseDouble(input.get(j));
							neg = new NegativeExpression(new TerminalExpression(num_after));
							num_after = neg.solve();
							input.set(j, String.valueOf(num_after));
							found = true;
							break;
						}
						else {
							found = false;
							break;
						}
					}
				}
				if(found) {					
					input.set(i, "");
				}
			}
			
			else {
				String next = "";
				
				if(isOperand(input.get(i))){
					for(int j = i+1; j < input.size(); j++) {
						if(!input.get(j).equals("")) {
							next = input.get(j);
							if(next.equals("-")) {
								for(int k = j+1; k < input.size(); k++) {
									if(input.get(k).length() > 0) {
										if(this.isNumber(input.get(k).charAt(0))) {
											num_after = Double.parseDouble(input.get(k));
											neg = new NegativeExpression(new TerminalExpression(num_after));
											num_after = neg.solve();
											input.set(k, String.valueOf(num_after));
											found = true;
											break;
										}	
										else {
											found = false;
											break;
										}
									}
								}
								if(found) {
									input.set(j, "");									
								}
								break;
							}
							else {
								break;
							}
						}
					}
				}
			}
		}
	}
}
