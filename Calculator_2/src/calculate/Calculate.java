package calculate;

import java.util.ArrayList;

import parser.Parser;
import solver.*;

public class Calculate {
	
	/**
	 * Class Calculate 
	 * untuk melakukan perhitungan yang ada pada layar sesuai
	 * dengan prioritas perhitungan pada umumnya
	 */
	
	/**
	 * Constructor untuk membuat Calculate
	 */
	public Calculate() {}
	
	/**
	 * 
	 * @param input_string (String layar)
	 * @param lastAns (Hasil jawaban perhitungan terakhir)
	 * @return String yang merupakan hasil perhitungan
	 * @throws exception yang berasal dari class Solver
	 */
	@SuppressWarnings("unchecked")
	public String calculate(String input_string, double lastAns) throws Exception {
		
		ArrayList<String> input;
		
		Parser parser = new Parser();
		parser.parsing(input_string);
		
		input = (ArrayList<String>) parser.getOperation().clone();

		AnsSolver ans = new AnsSolver();

		ArrayList<Solver> solver = new ArrayList<Solver>();
		solver.add(new NegativeSolver());
		solver.add(new TrigonoSolver());
		solver.add(new RootSolver());
		solver.add(new NegativeSolver());
		solver.add(new PowSolver());
		solver.add(new MultDivSolver());
		solver.add(new AddSubSolver());
		
		ans.setLastAns(lastAns);
		ans.solve(input);
		for(int i = 0; i < solver.size(); i++) {
			try {
				solver.get(i).solve(input);				
			}
			catch(Exception e){
				throw e;
			}
		}
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("")) {
				continue;
			}
			return input.get(i);
		}
		return "Error";
	}
}
