package button.specialButton;

import processing.core.*;
import java.util.*;
import screen.*;

public class MCButton extends SpecialButton{
	
	/**
	 * Class MCButton 
	 * untuk menyimpan hasil perhitungan ke dalam Queue
	 */
	
	/**
	 * Constructor untuk membuat MCButton
	 * 
	 * @param papplet (Processing sketch) 
	 * @param positionX (Lokasi koordinat X pada layar)
	 * @param positionY (Lokasi koordinat Y pada layar)
	 * @param sizeX (Ukuran X pada layar)
	 * @param sizeY (Ukuran Y pada layar)
	 * @param r (Color red code)
	 * @param g (Color green code)
	 * @param b (Color blue code)
	 */
	public MCButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b){
		super(papplet, "MC", positionX, positionY, sizeX, sizeY, r, g, b);
	}
	
	/**
	 * 
	 * @param check (Karakter yang akan dicek)
	 * @return Boolean apakah suatu karakter merupakan operand
	 */
	private boolean isOperand(char check) {
		int temp = (int) check;
		if((temp >= 40 && temp <= 45) || temp == 94){
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param input (String yang akan dicek)
	 * @return Boolean apakah dalam suatu string terdapat operand
	 */
	private boolean isIncludeOperand(String input){
		for(int i = 0; i < input.length(); i++){
			if(isOperand(input.charAt(i))){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return Menunjukkan ketersediaan tombol
	 * @param screen
	 * @param history
	 */
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		if(this.isIncludeOperand(screen.getShow())) {
			return false;
		}
		return true;
	}
	
	/**
	 * Fungsi tombol MC untuk menambahkan hasil perhitungan
	 * ke dalam queue history
	 * 
	 * @param screen
	 * @param history
	 */
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(screen, history)) {
			history.add(screen.getShow());
		}
	}
}
