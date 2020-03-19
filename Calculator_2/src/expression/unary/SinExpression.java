package expression.unary;

import expression.*;

public class SinExpression extends UnaryExpression{
	
	public SinExpression(Expression x){
		super(x);
	}
	
	@Override
	public double solve() {
		return Math.sin(Math.toRadians(this.x.solve()));
	}
}
