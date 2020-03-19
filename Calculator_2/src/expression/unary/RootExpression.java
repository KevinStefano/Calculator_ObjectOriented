package expression.unary;

import expression.*;

public class RootExpression extends UnaryExpression{
	
	public RootExpression(Expression x){
		super(x);
	}
	
	@Override
	public double solve() {
		return Math.sqrt(this.x.solve());
	}
}
