package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MultDivSolverTest {

	@Test
	public void test() throws Exception{
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		MultDivSolver solver = new MultDivSolver();
		
		test.add("3"); test.add("*"); test.add("9");
		ans.add("27.0"); ans.add(""); ans.add("");
		
		solver.solve(test);

		assertArrayEquals(test.toArray(), ans.toArray());
	}

}
