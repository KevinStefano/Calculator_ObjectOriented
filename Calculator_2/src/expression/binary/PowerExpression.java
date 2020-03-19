package expression.binary;

import expression.*;

public class PowerExpression extends BinaryExpression{

	public PowerExpression(Expression x, Expression y){
		super(x, y);
	}
	
	@Override
	public double solve() {
		return Math.pow(this.x.solve(), this.y.solve());
	}
	
}
