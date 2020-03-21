package expression.binary;

import expression.TerminalExpression;
import static org.junit.Assert.*;

import org.junit.Test;

public class AddExpressionTest {

	@Test
	public void testSolve() {
		AddExpression test = new AddExpression(new TerminalExpression(8d), new TerminalExpression(7d));
		Double ans = 15d;
		assertEquals(test.solve(), ans);
	}

}
