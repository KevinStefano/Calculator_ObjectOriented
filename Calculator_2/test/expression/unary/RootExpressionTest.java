package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;

public class RootExpressionTest {

	@Test
	public void testSolve() {
		RootExpression test = new RootExpression(new TerminalExpression(16d));
		Double ans = 4d;
		assertEquals(test.solve(), ans);
	}

}
