package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RootSolverTest {

	@Test
	public void testSolve() throws Exception {
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		RootSolver solver = new RootSolver();
		
		test.add("√"); test.add("4"); test.add("+"); test.add("cos"); test.add("90");
		ans.add(""); ans.add("2.0"); ans.add("+"); ans.add("cos"); ans.add("90");
		
		solver.solve(test);
		assertArrayEquals(test.toArray(), ans.toArray());
	}

}
