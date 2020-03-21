package expression.binary;

import expression.*;

abstract public class BinaryExpression extends Expression<Double>{
	
	protected Expression<Double> x;
	protected Expression<Double> y;
	
	public BinaryExpression(Expression<Double> x, Expression<Double> y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	abstract public Double solve();
}
