package calculate;

import java.util.ArrayList;
import parser.Parser;
import solver.*;

public class Calculate {
	
	public Calculate() {}
	
	@SuppressWarnings("unchecked")
	public String calculate(String input_string) {
		
		ArrayList<String> input;
		
		Parser parser = new Parser();
		parser.parsing(input_string);
		
		input = (ArrayList<String>) parser.getOperation().clone();
		
		ArrayList<Solver> solver = new ArrayList<Solver>();
		solver.add(new RootParser());
		solver.add(new NegativeParser());
		solver.add(new TrigonoParser());
		solver.add(new PowParser());
		solver.add(new MultDivParser());
		solver.add(new AddSubParser());
		
		for(int i = 0; i < solver.size(); i++) {
			solver.get(i).solve(input);
		}
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("")) {
				continue;
			}
			return input.get(i);
		}
		return "NaN";
	}
}
