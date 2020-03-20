package checker;
import java.util.*;

public class Checker {
	
	public Checker() {}
	
	private boolean isNumber(char check) {
		int temp = (int) check;
		return temp >= 48 && temp <= 57 || temp == 46;
	}
	
	private boolean isOperand(char check) {
	    int temp = (int) check;
	    ArrayList<Integer> operand = new ArrayList<Integer>(Arrays.asList(42, 43, 45, 47, 94));
		return operand.contains(temp);
	}
	
	private boolean isEqual(char check){
	    return (int)check == 61; 
	}
	
	private boolean isMinusUnary(char check){
	    return (int)check == 45;
	}
	
	private boolean isRoot(char check){
		return !isNumber(check) && !isOperand(check) && !isEqual(check) && !isMinusUnary(check) && !isTrigo(check);
	}
	
	private boolean isTrigo(char check){
	    int temp = (int) check;
	    ArrayList<Integer> sinCosTan = new ArrayList<Integer>(Arrays.asList(115, 105, 110, 99, 111, 116, 97));
	    return sinCosTan.contains(temp);
	}
	
	public char takeTrend(String in, int index){
	    char trend = '\0';
	    if(this.isOperand(in.charAt(index))){ trend = 'O'; }
	    if(this.isNumber(in.charAt(index))){ trend = 'N'; }
	    if(this.isEqual(in.charAt(index))){ trend = '='; }
	    if(this.isRoot(in.charAt(index))){ trend = 'R'; }
	    if(this.isTrigo(in.charAt(index))){ trend = 'T'; }
	    if(this.isMinusUnary(in.charAt(index))){ trend = '-'; }
	    return trend;
	}
	
	public boolean check(String in){
	    ArrayList<Character> pattern = new ArrayList<Character>();

	    char oldTrend = '\0', newTrend = '\0';
	    oldTrend = takeTrend(in, 0);
	    if( oldTrend == 'O' ){ return false; }

	    for(int i = 1; i < in.length(); i ++){
	    	newTrend = takeTrend(in, i);
	    	if(oldTrend == 'O' || oldTrend == 'R' || oldTrend == '-' || newTrend != oldTrend){
	    		pattern.add(oldTrend);
	    		oldTrend = newTrend;
	    	}
	    }    
	    for(int i = 1; i < pattern.size(); i ++){
	    	char before = pattern.get(i - 1);
	    	char after = pattern.get(i);
	    	if(before == 'O' && ( after == 'O' ) ){
	    		return false;
	    	}
	    	if(before == 'N' && ( after == 'R' || after == 'T' ) ){
	    		return false;
	    	}
	    	if(before == 'R' && ( after == '-' || after == 'T' ) ){
	    		return false;
	    	}
	    	if(before == 'T' && ( after == 'O' ) ){
	    		return false;
	    	}
	    	if(before == '-' && ( after == 'O' ) ){
	    		return false;
	    	}
	    }
	    char last = pattern.get(pattern.size() - 1);
	    return last == 'N';
	 }
}

	