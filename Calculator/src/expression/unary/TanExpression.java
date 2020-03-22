package expression.unary;

import expression.*;

public class TanExpression extends UnaryExpression{
	
	/**
	 * Class TanExpression
	 * untuk melakukan operasi tan
	 */
	
	/**
	 * Constructor pembentuk TanExpression
	 * 
	 * @param x (Angka yang akan dikalkulasi)
	 */
	public TanExpression(Expression<Double> x){
		super(x);
	}
	
	/**
	 * Method untuk melakukan operasi tan
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return Math.tan(Math.toRadians(this.x.solve()));
	}
}
