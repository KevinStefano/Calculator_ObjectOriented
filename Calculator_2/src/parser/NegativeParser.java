package parser;

import java.util.*;
import expression.TerminalExpression;
import expression.unary.*;

public class NegativeParser {
	
	public NegativeParser() {}
	
	public void parseNegative(ArrayList<String> input) {
		
		double num_after;
		NegativeExpression neg;
		
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
							break;
						}
					}
				}
				input.set(i, "");
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
											break;
										}										
									}
								}
								input.set(j, "");
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
	
	private boolean isNumber(char check) {
		int temp = (int) check;
		if(temp >= 48 && temp <= 57 || temp == 46) {
			return true;
		}
		return false;
	}
	
	private boolean isOperand(String check) {
		if(check.length() > 0) {
			if(!isNumber(check.charAt(0))) {
				return true;
			}
			return false;
		}
		return false;
	}
}
