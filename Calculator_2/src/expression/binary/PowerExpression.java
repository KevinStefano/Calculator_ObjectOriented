package expression.binary;

import expression.*;

public class PowerExpression extends BinaryExpression{

	public PowerExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	@Override
	public Double solve() {
		return Math.pow(this.x.solve(), this.y.solve());
	}
	
}
