package solver;

import java.util.ArrayList;

abstract public class Solver {
	
	abstract public void solve(ArrayList<String> input) throws Exception;
	
	protected boolean isNumber(char check) {
		int temp = (int) check;
		if(temp >= 48 && temp <= 57 || temp == 46) {
			return true;
		}
		return false;
	}
	
	protected boolean isOperand(String check) {
		if(check.length() > 0) {
			if(!isNumber(check.charAt(0))) {
				return true;
			}
			return false;
		}
		return false;
	}
}
