package expression.binary;

import expression.*;

public class AddExpression extends BinaryExpression{

	public AddExpression(Expression x, Expression y){
		super(x, y);
	}
	
	@Override
	public double solve() {
		return this.x.solve() + this.y.solve();
	}
	
}
