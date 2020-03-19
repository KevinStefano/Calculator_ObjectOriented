package expression.binary;

import expression.*;

public class DivideExpression extends BinaryExpression{

	public DivideExpression(Expression x, Expression y){
		super(x, y);
	}
	
	@Override
	public double solve() {
		return this.x.solve() / this.y.solve();
	}
	
}
