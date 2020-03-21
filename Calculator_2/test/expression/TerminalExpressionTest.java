package expression;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TerminalExpressionTest {

	@Test
	public void testSolve() {
		TerminalExpression test = new TerminalExpression(8d);
		Double ans = 8d;
		assertEquals(test.solve(), ans);
	}

}
