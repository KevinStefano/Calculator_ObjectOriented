package expression.unary;

import expression.*;

public class CosExpression extends UnaryExpression{
	
	public CosExpression(Expression x){
		super(x);
	}
	
	@Override
	public double solve() {
		return Math.cos(Math.toRadians(this.x.solve()));
	}
}
