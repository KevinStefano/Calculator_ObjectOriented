package expression.binary;

import expression.*;

public class DivideExpression extends BinaryExpression{
	
	/**
	 * Class DivideExpression 
	 * untuk membagi 2 bilangan
	 */
	
	/**
	 * Constructor pembentuk DivideExpression
	 * 
	 * @param x (angka sebelah kiri)
	 * @param y (angka sebelah kanan)
	 */
	public DivideExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	/**
	 * Method untuk membagi 2 bilangan
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return this.x.solve() / this.y.solve();
	}
	
}
