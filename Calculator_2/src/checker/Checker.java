package checker;
import java.util.*;

abstract public class Checker {
	
	public Checker() {}
	
	protected boolean isNumber(char check) {
		int temp = (int) check;
		return temp >= 48 && temp <= 57 || temp == 46;
	}
	
	protected boolean isOperand(char check) {
	    int temp = (int) check;
	    ArrayList<Integer> operand = new ArrayList<Integer>(Arrays.asList(42, 43, 45, 47, 94));
		return operand.contains(temp);
	}
	
	protected boolean isEqual(char check){
	    return (int)check == 61; 
	}
	
	protected boolean isMinusUnary(char check){
	    return (int)check == 45;
	}
	
	protected boolean isRoot(char check){
		return check == '√';
	}
	
	protected boolean isNotMinus(char check) {
		int temp = (int) check;
	    ArrayList<Integer> operand = new ArrayList<Integer>(Arrays.asList(42, 43, 47, 94));
		return operand.contains(temp);
	}
	
	abstract public void check(String in) throws Exception; 
}

	