package button.specialButton;

import processing.core.*;
import screen.*;
import java.util.*;

public class AnsButton extends SpecialButton{
	
	/**
	 * Class AnsButton 
	 * untuk mengeluarkan "ans" pada layar
	 */
	
	/**
	 * Constructor untuk membuat AnsButton
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
	public AnsButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "Ans", positionX, positionY, sizeX, sizeY, r, g, b);
	}

	/**
	 * @return Menunjukkan ketersediaan tombol
	 * @param screen
	 * @param history
	 */
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		return true;
	}
	
	/**
	 * Fungsi tombol Ans untuk mengeluarkan "ans" pada layar
	 * 
	 * @param screen
	 * @param history
	 */
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(screen, history)) {
			screen.addShow("ans");
		}
	}
}
