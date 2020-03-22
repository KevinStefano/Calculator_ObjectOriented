package expression.unary;

import expression.*;

public class RootExpression extends UnaryExpression{
	
	/**
	 * Class RootExpression 
	 * untuk melakukan operasi akar
	 */
	
	/**
	 * Constructor pembentuk RootExpression
	 * 
	 * @param x (Angka yang akan dikalkulasi)
	 */
	public RootExpression(Expression<Double> x){
		super(x);
	}
	
	/**
	 * Method untuk melakukan operasi akar
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return Math.sqrt(this.x.solve());
	}
}
