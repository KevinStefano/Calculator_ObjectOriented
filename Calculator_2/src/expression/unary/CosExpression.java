package expression.unary;

import expression.*;

public class CosExpression extends UnaryExpression{
	
	public CosExpression(Expression<Double> x){
		super(x);
	}
	
	@Override
	public Double solve() {
		return Math.cos(Math.toRadians(this.x.solve()));
	}
}
