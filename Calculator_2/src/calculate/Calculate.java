package calculate;

import java.util.ArrayList;
import parser.*;

public class Calculate {
	
	public Calculate() {}
	
	@SuppressWarnings("unchecked")
	public String calculate(String input_string) {
		
		ArrayList<String> input;
		
		Parser parser = new Parser();
		parser.parsing(input_string);
		
		input = (ArrayList<String>) parser.getOperation().clone();
		
		for(int i = 0; i < input.size(); i++) {
			System.out.print(input.get(i));
		}
		System.out.println();
		SinParser sinparse = new SinParser();
		CosParser cosparse = new CosParser();
		TanParser tanparse = new TanParser();
		RootParser rootparse = new RootParser();
		NegativeParser negparse = new NegativeParser();
		MultDivParser mdparse = new MultDivParser();
		AddSubParser asparse = new AddSubParser();
		PowParser pparse = new PowParser();
		
		rootparse.parseRoot(input);
		negparse.parseNegative(input);
		sinparse.parseSin(input);
		cosparse.parseCos(input);
		tanparse.parseTan(input);
		pparse.parsePow(input);
		mdparse.parseMultDiv(input);
		asparse.parseAddSub(input);
		
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("")) {
				continue;
			}
			return input.get(i);
		}
		return "NaN";
	}
}
