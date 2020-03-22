package expression.binary;

import expression.*;

public class AddExpression extends BinaryExpression{
	
	/**
	 * Class AddExpression
	 * untuk menjumlahkan 2 bilangan
	 */
	
	/**
	 * Constructor pembentuk AddExpression
	 * 
	 * @param x (angka sebelah kiri)
	 * @param y (angka sebelah kanan)
	 */
	public AddExpression(Expression<Double> x, Expression<Double> y){
		super(x, y);
	}
	
	/**
	 * Method untuk menjumlahkan 2 bilangan
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return this.x.solve() + this.y.solve();
	}
	
}
