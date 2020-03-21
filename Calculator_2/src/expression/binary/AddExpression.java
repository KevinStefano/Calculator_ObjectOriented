package expression.binary;

import expression.*;

public class AddExpression extends BinaryExpression{

	public AddExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	@Override
	public Double solve() {
		return this.x.solve() + this.y.solve();
	}
	
}
