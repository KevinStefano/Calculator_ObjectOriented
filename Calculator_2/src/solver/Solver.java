package solver;

import java.util.ArrayList;

abstract public class Solver {
	
	/**
	 * Class Solver 
	 * untuk melakukan pengecekan karakter
	 */
	
	
	abstract public void solve(ArrayList<String> input) throws Exception;
	
	/**
	 * Method untuk mengecek apakah check merupakan angka
	 * 
	 * @param check (karakter yang akan dicek)
	 * @return Boolean hasil pengecekan
	 */
	protected boolean isNumber(char check) {
		int temp = (int) check;
		if(temp >= 48 && temp <= 57 || temp == 46) {
			return true;
		}
		return false;
	}
	
	/**
	 * Method untuk mengecek apakah check merupakan operand
	 * 
	 * @param check (karakter yang akan dicek)
	 * @return Boolean hasil pengecekan
	 */
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
