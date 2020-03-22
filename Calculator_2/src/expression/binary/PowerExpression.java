package expression.binary;

import expression.*;

public class PowerExpression extends BinaryExpression{

	/**
	 * Class PowerExpression
	 * untuk melakukan pemangkatan 2 bilangan
	 */
	
	/**
	 * Constructor pembentuk PowerExpression
	 * 
	 * @param x (angka sebelah kiri)
	 * @param y (angka sebelah kanan)
	 */
	public PowerExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	/**
	 * Method untuk membagi 2 bilangan
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return Math.pow(this.x.solve(), this.y.solve());
	}
	
}
