package expression.unary;

import expression.*;

public class TanExpression extends UnaryExpression{
	
	public TanExpression(Expression x){
		super(x);
	}
	
	@Override
	public double solve() {
		return Math.tan(Math.toRadians(this.x.solve()));
	}
}
