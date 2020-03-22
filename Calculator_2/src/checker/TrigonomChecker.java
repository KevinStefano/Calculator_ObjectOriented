package checker;

import exception.EndOperandException;
import exception.OperatorOperatorException;
import parser.Parser;

public class TrigonomChecker extends Checker{

	/**
	 * Class TrigonomChecker 
	 * untuk melakukan pengecekan apakah terdapat 
	 * trigonom dan binary operator yang berdempetan
	 */
	
	/**
	 * Constructor untuk membangun TrigonomChecker
	 */
	public TrigonomChecker() {}
	
	/**
	 * Method check untuk melakukan pengecekan 
	 * terhadap string apakah terdapat trigonom
	 * dan binary operator yang berdempetan
	 * 
	 * @param input (String yang akan dicek)
	 * @throws Exception (Melakukan throw OperatorOperatorException,
	 * 						atau EndOperandException)
	 */
	public void check(String input) throws Exception{
		Parser parse = new Parser();
		parse.parsing(input);
		
		for(int i = 0; i < parse.getOperation().size()-1; i++) {
			if(isTrigonom(parse.getOperation().get(i))) {
				if(isTrigonom(parse.getOperation().get(i+1))) {
					continue;
				}
				if(!isNumber(parse.getOperation().get(i+1).charAt(0)) && !isMinusUnary(parse.getOperation().get(i+1).charAt(0))) {
					throw new OperatorOperatorException();
				}
			}
		}
		if(isTrigonom(parse.getOperation().get(parse.getOperation().size()-1))) {
			throw new EndOperandException();
		}
	}
	
	/**
	 * Method untuk mengecek apakah inputan adalah
	 * "sin" atau "cos" atau "tan"
	 * 
	 * @param s (String yang akan dicek)
	 * @return Boolean apakah mengandung sin atau cos atau tan
	 */
	private boolean isTrigonom(String s) {
		if(s.equals("sin") || s.equals("cos") || s.equals("tan")) {
			return true;
		}
		return false;
	}
}
