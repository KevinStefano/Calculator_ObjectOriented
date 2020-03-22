package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PowSolverTest {

	@Test
	public void test() {
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		PowSolver solver = new PowSolver();
		
		test.add("2"); test.add("^"); test.add("-1"); test.add("+"); test.add("9");
		ans.add("0.5"); ans.add(""); ans.add(""); ans.add("+"); ans.add("9");
		
		solver.solve(test);
		assertArrayEquals(test.toArray(), ans.toArray());
	}
}
