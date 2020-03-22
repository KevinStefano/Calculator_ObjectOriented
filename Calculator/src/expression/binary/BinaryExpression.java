package expression.binary;

import expression.*;

abstract public class BinaryExpression extends Expression<Double>{
	
	/**
	 * Class BinaryExpression 
	 * untuk operasi 2 bilangan
	 */
	
	protected Expression<Double> x;
	protected Expression<Double> y;
	
	/**
	 * Constructor pembentuk BinaryExpression
	 * 
	 * @param x (angka sebelah kiri)
	 * @param y (angka sebelah kanan)
	 */
	public BinaryExpression(Expression<Double> x, Expression<Double> y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	abstract public Double solve();
}
