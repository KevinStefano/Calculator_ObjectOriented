package expression.unary;

import expression.*;

public class SinExpression extends UnaryExpression{
	
	/**
	 * Class SinExpression 
	 * untuk melakukan operasi sin
	 */
	
	/**
	 * Constructor pembentuk SinExpression
	 * 
	 * @param x (Angka yang akan dikalkulasi)
	 */
	public SinExpression(Expression<Double> x){
		super(x);
	}
	
	/**
	 * Method untuk melakukan operasi sin
	 *
	 *@return Double
	 */
	@Override
	public Double solve() {
		return Math.sin(Math.toRadians(this.x.solve()));
	}
}
