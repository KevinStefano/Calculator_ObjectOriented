package expression.binary;

import expression.*;

public class DivideExpression extends BinaryExpression{

	public DivideExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	@Override
	public Double solve() {
		return this.x.solve() / this.y.solve();
	}
	
}
