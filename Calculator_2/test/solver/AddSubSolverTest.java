package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AddSubSolverTest {

	@Test
	public void testSolve() {
		ArrayList<String> test1 = new ArrayList<String>();
		ArrayList<String> test2 = new ArrayList<String>();
		ArrayList<String> ans1 = new ArrayList<String>();
		ArrayList<String> ans2 = new ArrayList<String>();
		AddSubSolver asSolver = new AddSubSolver();
		
		test1.add("33"); test1.add("+"); test1.add("82"); test1.add("*"); test1.add("23");
		test2.add("12"); test2.add("-"); test2.add("9"); test2.add("+"); test2.add("3");
		ans1.add("115.0"); ans1.add(""); ans1.add(""); ans1.add("*"); ans1.add("23");
		ans2.add("6.0"); ans2.add(""); ans2.add(""); ans2.add(""); ans2.add("");
		
		asSolver.solve(test1);
		asSolver.solve(test2);
		
		assertArrayEquals(test1.toArray(), ans1.toArray());
		assertArrayEquals(test2.toArray(), ans2.toArray());
	}

}
