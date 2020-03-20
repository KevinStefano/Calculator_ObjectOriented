package parser;

import java.util.*;
import expression.TerminalExpression;
import expression.unary.*;

public class RootParser {

	public RootParser() {}
	
	public void parseRoot(ArrayList<String> input) {
		
		double num_after;
		RootExpression root;
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("√")) {
				for(int j = i+1; j < input.size(); j++) {
					if(input.get(j).length() > 0) {
						if(this.isNumber(input.get(j).charAt(0))) {
							num_after = Double.parseDouble(input.get(j));
							root = new RootExpression(new TerminalExpression(num_after));
							num_after = root.solve();
							input.set(j, String.valueOf(num_after));
							break;
						}						
					}
				}
				input.set(i, "");
			}
		}
		
	}
	
	private boolean isNumber(char check) {
		int temp = (int) check;
		if(temp >= 48 && temp <= 57 || temp == 46) {
			return true;
		}
		return false;
	}
}
