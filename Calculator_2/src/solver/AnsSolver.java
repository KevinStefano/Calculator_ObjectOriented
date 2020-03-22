package solver;

import java.util.ArrayList;

import exception.NoAnsException;

public class AnsSolver extends Solver{
	
	/**
	 *  Class AnsSolver 
	 *  untuk merubah "ans" menjadi angka
	 */
	
	private double lastAns;
	
	/**
	 * Constructor pembentuk AnsSolver
	 */
	public AnsSolver(){
		this.lastAns = 0;
	}
	
	/**
	 * Method untuk mengeset lastAns
	 * 
	 * @param lastAns (input value yang akan merubah lastAns)
	 */
	public void setLastAns(double lastAns) {
		this.lastAns = lastAns;
	}
	
	/**
	 * Method untuk mendapatkan lastAns
	 * 
	 * @return double
	 */
	public double getLastAns() {
		return this.lastAns;
	}

	/**
	 * Method untuk merubah "ans" menjadi angka
	 * 
	 * @param input (List yang akan diselesaikan)
	 * @throws Exception (throw NoAnsException)
	 */
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
