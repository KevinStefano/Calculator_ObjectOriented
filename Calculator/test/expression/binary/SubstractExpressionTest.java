package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class SubstractExpressionTest {

	@Test
	public void testSolve() {
		SubstractExpression test = new SubstractExpression(new TerminalExpression(8d), new TerminalExpression(7d));
		Double ans = 1d;
		assertEquals(test.solve(), ans);
	}

}
