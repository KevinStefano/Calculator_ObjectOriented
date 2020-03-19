package expression;

public class TerminalExpression extends Expression{
	
	private double x;
	
	public TerminalExpression(double x) {
		super();
		this.x = x;
	}
	
	@Override
	public double solve() {
		return this.x;
	}
}
