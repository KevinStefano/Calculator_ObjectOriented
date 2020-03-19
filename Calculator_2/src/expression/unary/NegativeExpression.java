package expression.unary;

import expression.*;

public class NegativeExpression extends UnaryExpression{
	
	public NegativeExpression(Expression x){
		super(x);
	}
	
	@Override
	public double solve() {
		return -(this.x.solve());
	}
}
