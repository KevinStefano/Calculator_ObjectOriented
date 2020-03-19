package expression.binary;

import expression.*;

public class MultiplyExpression extends BinaryExpression{

	public MultiplyExpression(Expression x, Expression y){
		super(x, y);
	}
	
	@Override
	public double solve() {
		return this.x.solve() * this.y.solve();
	}
	
}
