package expression.binary;

import expression.*;

abstract public class BinaryExpression extends Expression{
	
	protected Expression x;
	protected Expression y;
	
	public BinaryExpression(Expression x, Expression y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	abstract public double solve();
}
