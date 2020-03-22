package expression.unary;

import expression.*;

abstract public class UnaryExpression extends Expression<Double>{
	
	/**
	 * Class UnaryExpression 
	 * untuk operasi 1 bilangan
	 */
	
	protected Expression<Double> x;
	
	/**
	 * Constructor pembentuk UnaryExpression
	 * 
	 * @param x (Angka yang akan dikalkulasi)
	 */
	public UnaryExpression(Expression<Double> x) {
		super();
		this.x = x;
	}
	
	abstract public Double solve();
}
