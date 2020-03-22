package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AnsSolverTest {

	@Test
	public void testSolve() throws Exception{
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		AnsSolver solver = new AnsSolver();
		
		test.add("ans"); test.add("+"); test.add("ans");
		ans.add("3.0"); ans.add("+"); ans.add("3.0");
		
		solver.setLastAns(3d);
		solver.solve(test);

		assertArrayEquals(test.toArray(), ans.toArray());
	}

}
