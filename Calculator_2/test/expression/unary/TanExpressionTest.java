package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class TanExpressionTest {

	@Test
	public void testSolve() {
		TanExpression test = new TanExpression(new TerminalExpression(45d));
		Double ans = Math.tan(Math.toRadians(45d));
		assertEquals(test.solve(), ans);
	}

}
