package solver;

import java.util.ArrayList;

import exception.NoAnsException;

public class AnsSolver extends Solver{
	
	private double lastAns;
	
	public AnsSolver(){
		this.lastAns = 0;
	}
	
	public void setLastAns(double lastAns) {
		this.lastAns = lastAns;
	}
	
	public double getLastAns() {
		return this.lastAns;
	}

	@Override
	public void solve(ArrayList<String> input) throws Exception{
		if(this.getLastAns() == -923485 && input.contains("ans")) {
			throw new NoAnsException();
		}
		for(int i = 0; i < input.size(); i++) {
			if(input.get(i).equals("ans")) {
				input.set(i, String.valueOf(this.getLastAns()));
			}
		}
	}
}
