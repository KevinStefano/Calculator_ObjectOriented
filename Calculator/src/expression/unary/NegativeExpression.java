package expression.unary;

import expression.*;

public class NegativeExpression extends UnaryExpression{
	
	/**
	 * Class NegativeExpression 
	 * untuk melakukan operasi negative
	 */
	
	/**
	 * Constructor pembentuk NegativeExpression
	 * 
	 * @param x (Angka yang akan dikalkulasi)
	 */
	public NegativeExpression(Expression<Double> x){
		super(x);
	}
	
	/**
	 * Method untuk melakukan operasi negative
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return -(this.x.solve());
	}
}
