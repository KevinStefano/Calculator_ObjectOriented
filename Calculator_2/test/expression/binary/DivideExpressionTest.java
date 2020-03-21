package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class DivideExpressionTest {

	@Test
	public void testSolve() {
		DivideExpression test = new DivideExpression(new TerminalExpression(8d), new TerminalExpression(4d));
		Double ans = 2d;
		assertEquals(test.solve(), ans);
	}
}