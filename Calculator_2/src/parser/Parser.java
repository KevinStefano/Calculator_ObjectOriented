package parser;

import java.util.*;

public class Parser {
	
	ArrayList<String> operation;
	
	public Parser() {
		operation = new ArrayList<String>();
	}
	
	public ArrayList<String> getOperation(){
		return this.operation;
	}
	
	public void parsing(String input) {
		int counter = 0;
		String temp_num = "";
		String temp_str = "";
		
		for(int i = 0; i < input.length(); i++) {
			if(isNumber(input.charAt(i))) {
				temp_num += input.charAt(i);
			}
			else if(isAlphabet(input.charAt(i))) {
				temp_str += input.charAt(i);
				counter++;
				if(counter == 3) {
					this.operation.add(temp_str);
					temp_str = "";
					counter = 0;
				}
			}
			else {
				if(!temp_str.equals("")) {
					this.operation.add(temp_str);
				}
				if(!temp_num.equals("")) {
					this.operation.add(temp_num);
				}
				this.operation.add(String.valueOf(input.charAt(i)));
				temp_num = "";
				temp_str = "";
			}
		}
		if(!temp_str.equals("")) {
			this.operation.add(temp_str);
		}
		if(!temp_num.equals("")) {
			this.operation.add(temp_num);
		}
	}
	
	private boolean isNumber(char check) {
		int temp = (int) check;
		if(temp >= 48 && temp <= 57 || temp == 46) {
			return true;
		}
		return false;
	}
	
	private boolean isAlphabet(char check) {
		int temp = (int) check;
		if(temp >= 97 && temp <= 122) {
			return true;
		}
		return false;
	}
}
