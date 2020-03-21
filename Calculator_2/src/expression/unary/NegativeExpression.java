package expression.unary;

import expression.*;

public class NegativeExpression extends UnaryExpression{
	
	public NegativeExpression(Expression<Double> x){
		super(x);
	}
	
	@Override
	public Double solve() {
		return -(this.x.solve());
	}
}
