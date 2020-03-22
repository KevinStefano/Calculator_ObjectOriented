package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.TerminalExpression;
import expression.unary.CosExpression;

public class NegativeExpressionTest {

	@Test
	public void testSolve() {
		NegativeExpression test = new NegativeExpression(new TerminalExpression(3.2d));
		Double ans = -3.2d;
		assertEquals(test.solve(), ans);
	}

}
