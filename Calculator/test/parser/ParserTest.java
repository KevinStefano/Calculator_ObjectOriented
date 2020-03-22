package parser;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class ParserTest {

	@Test
	public void testGetOperation() {
		Parser parser = new Parser();
		ArrayList<String> ans = new ArrayList<String>();
		
		assertArrayEquals(parser.getOperation().toArray(), ans.toArray());
	}

	@Test
	public void testParsing() {
		Parser parser = new Parser();
		ArrayList<String> ans = new ArrayList<String>();
		String test = "3+2-sin90*8/2^14*ans";
		parser.parsing(test);
		ans.add("3"); ans.add("+"); ans.add("2"); ans.add("-"); ans.add("sin");
		ans.add("90"); ans.add("*"); ans.add("8"); ans.add("/"); ans.add("2"); 
		ans.add("^"); ans.add("14"); ans.add("*"); ans.add("ans");
		
		
		assertArrayEquals(parser.getOperation().toArray(), ans.toArray());
	}

}
