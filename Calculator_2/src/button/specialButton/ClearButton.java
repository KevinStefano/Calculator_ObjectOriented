package button.specialButton;

import processing.core.*;
import screen.*;
import java.util.*;

public class ClearButton extends SpecialButton{
	
	/**
	 * Class ClearButton 
	 * untuk menghapus queue history MC dan tampilan pada layar
	 */
	
	/**
	 * Constructor untuk membuat ClearButton
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
	public ClearButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "AC", positionX, positionY, sizeX, sizeY, r, g, b);
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
	 * Fungsi tombol Clear untuk menghapus tulisan pada layar
	 * dan menghapus queue history MC
	 * 
	 * @param screen
	 * @param history
	 */
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(screen, history)) {
			for(int i = 0; i < history.size(); i++) {
				history.remove();
			}
			screen.setShow("");
		}
	}
	
}
