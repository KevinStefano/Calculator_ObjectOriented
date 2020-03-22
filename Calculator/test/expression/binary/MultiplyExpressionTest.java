package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class MultiplyExpressionTest {

	@Test
	public void testSolve() {
		MultiplyExpression test = new MultiplyExpression(new TerminalExpression(8d), new TerminalExpression(7d));
		Double ans = 56d;
		assertEquals(test.solve(), ans);
	}

}
