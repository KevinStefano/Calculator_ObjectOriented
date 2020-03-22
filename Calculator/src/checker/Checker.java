package checker;
import java.util.*;

abstract public class Checker {
	
	/**
	 * Class Checker 
	 * untuk melakukan pengecekan character
	 */
	
	/**
	 * Constructor untuk membuat Checker
	 */
	public Checker() {}
	
	/**
	 * Method isNumber berfungsi untuk melakukan
	 * pengecekan terhadap sebuah karakter, apakah karakter
	 * tersebut merupakan angka
	 * 
	 * @param check (input yang akan dicek)
	 * @return Boolean yang merupakan hasil dari pengecekan
	 */
	protected boolean isNumber(char check) {
		int temp = (int) check;
		return temp >= 48 && temp <= 57 || temp == 46;
	}
	
	/**
	 * Method isOperand berfungsi untuk melakukan
	 * pengecekan terhadap sebuah karakter, apakah karakter
	 * tersebut merupakan angka
	 * 
	 * @param check (input yang akan dicek)
	 * @return Boolean yang merupakan hasil dari pengecekan
	 */
	protected boolean isOperand(char check) {
	    int temp = (int) check;
	    ArrayList<Integer> operand = new ArrayList<Integer>(Arrays.asList(42, 43, 45, 47, 94));
		return operand.contains(temp);
	}
	
	/**
	 * Method isEqual berfungsi untuk melakukan
	 * pengecekan terhadap sebuah karakter, apakah karakter 
	 * tersebut merupakan '='
	 * 
	 * @param check (input yang akan dicek)
	 * @return Boolean yang merupakan hasil dari pengecekan
	 */
	protected boolean isEqual(char check){
	    return (int)check == 61; 
	}
	
	/**
	 * Method isMinusUnary untuk melakukan
	 * pengecekan terhadap sebuah karakter, apakah karakter
	 * tersebut merupakan '-'
	 * 
	 * @param check (input yang akan dicek)
	 * @return Boolean yang merupakan hasil dari pengecekan
	 */
	protected boolean isMinusUnary(char check){
	    return (int)check == 45;
	}
	
	/**
	 * Method isRoot untuk melakukan
	 * pengecekan terhadap sebuah karakter, apakah karakter
	 * tersebut merupakan '√'
	 * 
	 * @param check (input yang akan dicek)
	 * @return Boolean yang merupakan hasil dari pengecekan
	 */
	protected boolean isRoot(char check){
		return check == '√';
	}
	
	/**
	 * Method isNotMinus untuk melakukan
	 * pengecekan terhadap sebuah karakter, apakah karakter
	 * tersebut merupakan operand selain '-'
	 * 
	 * @param check (input yang akan dicek)
	 * @return Boolean yang merupakan hasil dari pengecekan
	 */
	protected boolean isNotMinus(char check) {
		int temp = (int) check;
	    ArrayList<Integer> operand = new ArrayList<Integer>(Arrays.asList(42, 43, 47, 94));
		return operand.contains(temp);
	}
	
	abstract public void check(String in) throws Exception; 
}

	