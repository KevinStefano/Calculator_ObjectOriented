package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NegativeSolverTest {

	@Test
	public void test() {
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		NegativeSolver solver = new NegativeSolver();
		
		test.add("-"); test.add("9"); test.add("+"); test.add("9");
		ans.add(""); ans.add("-9.0"); ans.add("+"); ans.add("9");
		
		solver.solve(test);
		assertArrayEquals(test.toArray(), ans.toArray());
	}
}
