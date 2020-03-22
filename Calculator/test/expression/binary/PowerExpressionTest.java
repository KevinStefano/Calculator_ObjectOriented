package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class PowerExpressionTest {

	@Test
	public void testSolve() {
		PowerExpression test = new PowerExpression(new TerminalExpression(8d), new TerminalExpression(2d));
		Double ans = 64d;
		assertEquals(test.solve(), ans);
	}

}
