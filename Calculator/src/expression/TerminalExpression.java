package expression;

public class TerminalExpression extends Expression<Double>{
	
	/**
	 * Class TerminalExpression 
	 * untuk memberikan nilai
	 */
	
	private Double x;
	
	/**
	 * Constructor untuk membentuk TerminalExpression
	 * 
	 * @param x (Input angka)
	 */
	public TerminalExpression(Double x) {
		super();
		this.x = x;
	}
	
	/**
	 * Method untuk mengembalikan atribut x
	 * 
	 * @return Double
	 */
	@Override
	public Double solve() {
		return this.x;
	}
}
