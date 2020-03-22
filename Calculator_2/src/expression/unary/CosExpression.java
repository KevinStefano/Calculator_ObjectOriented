package expression.unary;

import expression.*;

public class CosExpression extends UnaryExpression{
	
	/**
	 * Class CosExpression 
	 * untuk melakukan operasi cos
	 */
	
	/**
	 * Constructor pembentuk CosExpression
	 * 
	 * @param x (Angka yang akan dikalkulasi)
	 */
	public CosExpression(Expression<Double> x){
		super(x);
	}
	
	/**
	 * Method untuk melakukan operasi cos
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return Math.cos(Math.toRadians(this.x.solve()));
	}
}
