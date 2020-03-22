package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TrigonoSolverTest {

	@Test
	public void testSolve() {
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		TrigonoSolver solver = new TrigonoSolver();
		
		test.add("-"); test.add("4"); test.add("+"); test.add("sin"); test.add("90");
		ans.add("-"); ans.add("4"); ans.add("+"); ans.add(""); ans.add("1.0");
		
		solver.solve(test);
		assertArrayEquals(test.toArray(), ans.toArray());
	}

}
