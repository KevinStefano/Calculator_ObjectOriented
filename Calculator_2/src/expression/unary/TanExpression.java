package expression.unary;

import expression.*;

public class TanExpression extends UnaryExpression{
	
	public TanExpression(Expression<Double> x){
		super(x);
	}
	
	@Override
	public Double solve() {
		return Math.tan(Math.toRadians(this.x.solve()));
	}
}
