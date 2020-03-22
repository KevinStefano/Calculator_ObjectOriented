package expression.binary;

import expression.*;

public class SubstractExpression extends BinaryExpression{

	/**
	 * Class SubstractExpression
	 * untuk mengurangi 2 bilangan
	 */

	/**
	 * Constructor pembentuk SubstractExpression
	 * 
	 * @param x (angka sebelah kiri)
	 * @param y (angka sebelah kanan)
	 */
	public SubstractExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	/**
	 * Method untuk mengurangi 2 bilangan
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return this.x.solve() - this.y.solve();
	}
	
}
