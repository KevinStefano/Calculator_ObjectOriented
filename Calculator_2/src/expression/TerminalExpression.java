package expression;

public class TerminalExpression extends Expression<Double>{
	
	private Double x;
	
	public TerminalExpression(Double x) {
		super();
		this.x = x;
	}
	
	@Override
	public Double solve() {
		return this.x;
	}
}
