package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;
import expression.binary.AddExpression;

public class CosExpressionTest {

	@Test
	public void testSolve() {
		CosExpression test = new CosExpression(new TerminalExpression(0d));
		Double ans = 1d;
		assertEquals(test.solve(), ans);
	}
}
