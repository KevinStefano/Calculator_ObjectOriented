package expression.unary;

import expression.*;

public class RootExpression extends UnaryExpression{
	
	public RootExpression(Expression<Double> x){
		super(x);
	}
	
	@Override
	public Double solve() {
		return Math.sqrt(this.x.solve());
	}
}
