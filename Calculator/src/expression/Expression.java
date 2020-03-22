package expression;

abstract public class Expression <T> {
	
	/**
	 * Generic Class untuk menentukan type
	 */
	
	/**
	 * Constructor pembentuk Expression
	 */
	protected Expression(){}
	abstract public T solve();
}
