package button.specialButton;

import processing.core.*;
import screen.*;
import java.util.*;

public class MRButton extends SpecialButton{
	
	/**
	 * Class MRBNutton 
	 * untuk melakukan remove terhadap
	 * queue history dan menampilkan hasilnya ke layar
	 */
	
	/**
	 * Constructor untuk membuat MRButton
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
	public MRButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b){
		super(papplet, "MR", positionX, positionY, sizeX, sizeY, r, g, b);
	}
	
	/** 
	 * @return Menunjukkan ketersediaan tombol
	 * @param screen
	 * @param history
	 */
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		if(history.size() == 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * Fungsi tombol MR adalah untuk melakukan remove pada
	 * queue history dan menampilkan hasilnya ke layar
	 * 
	 * @param screen
	 * @param history
	 */
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(new Screen(this.papplet), history)) {
			screen.addShow(history.remove());
		}
	}
}
