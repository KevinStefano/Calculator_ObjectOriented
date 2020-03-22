package expression.binary;

import expression.*;

public class MultiplyExpression extends BinaryExpression{
	
	/**
	 * Class MultiplyExpression
	 * untuk mengalikan 2 bilangan
	 */
	
	/**
	 * Constructor pembentuk MultiplyExpression
	 * 
	 * @param x (angka sebelah kiri)
	 * @param y (angka sebelah kanan)
	 */
	public MultiplyExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	/**
	 * Method untuk mengalikan 2 bilangan
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return this.x.solve() * this.y.solve();
	}
	
}
