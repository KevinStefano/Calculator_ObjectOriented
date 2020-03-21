package expression.unary;

import expression.*;

public class SinExpression extends UnaryExpression{
	
	public SinExpression(Expression<Double> x){
		super(x);
	}
	
	@Override
	public Double solve() {
		return Math.sin(Math.toRadians(this.x.solve()));
	}
}
