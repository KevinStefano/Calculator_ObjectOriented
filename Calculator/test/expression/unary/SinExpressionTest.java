package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class SinExpressionTest {

	@Test
	public void testSolve() {
		SinExpression test = new SinExpression(new TerminalExpression(90d));
		Double ans = 1d;
		assertEquals(test.solve(), ans);
	}

}
