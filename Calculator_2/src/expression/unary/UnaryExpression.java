package expression.unary;

import expression.*;

abstract public class UnaryExpression extends Expression<Double>{
	
	protected Expression<Double> x;
	
	public UnaryExpression(Expression<Double> x) {
		super();
		this.x = x;
	}
	
	abstract public Double solve();
}
