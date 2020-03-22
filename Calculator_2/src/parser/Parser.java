package parser;

import java.util.*;

public class Parser {
	
	/**
	 * Class Parser 
	 * untuk melakukan parsing input ke dalam bentuk ArrayList
	 */
	
	ArrayList<String> operation;
	
	/**
	 * Constructor pembentuk Parser
	 */
	public Parser() {
		operation = new ArrayList<String>();
	}
	
	/**
	 * Method untuk mendapatkan atribut operation
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getOperation(){
		return this.operation;
	}
	
	/**
	 * Method untuk melakukan parsing String ke
	 * dalam bentuk ArrayList dan dimasukkan ke
	 * dalam atribut operation
	 * 
	 * @param input (String yang akan diparse)
	 */
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
	
	/**
	 * 
	 * Method untuk melakukan pengecekan apakah
	 * karakter merupakan angka
	 * 
	 * @param check (karakter yang akan dicek)
	 * @return Boolean hasil pengecekan
	 */
	private boolean isNumber(char check) {
		int temp = (int) check;
		if(temp >= 48 && temp <= 57 || temp == 46) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * Method untuk melakukan pengecekan apakah
	 * karakter merupakan alphabet
	 * 
	 * @param check (karakter yang akan dicek)
	 * @return Boolean hasil pengecekan
	 */
	private boolean isAlphabet(char check) {
		int temp = (int) check;
		if(temp >= 97 && temp <= 122) {
			return true;
		}
		return false;
	}
}
