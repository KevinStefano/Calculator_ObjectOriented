package expression.unary;

import expression.*;

abstract public class UnaryExpression extends Expression{
	
	protected Expression x;
	
	public UnaryExpression(Expression x) {
		super();
		this.x = x;
	}
	
	abstract public double solve();
}
