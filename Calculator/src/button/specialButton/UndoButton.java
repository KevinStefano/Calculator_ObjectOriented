package button.specialButton;

import processing.core.*;
import screen.*;
import java.util.*;

public class UndoButton extends SpecialButton{
	
	/**
	 * Class UndoButton 
	 * berfungsi untuk menghapus 
	 * satu karakter dari layar
	 */
	
	/**
	 * Constructor untuk membuat UndoButton
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
	public UndoButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "<-", positionX, positionY, sizeX, sizeY, r, g, b);
	}
	
	/**
	 * @return Menunjukkan ketersediaan tombol
	 * @param screen
	 * @param history
	 */
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		if(screen.getShow().length() > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Fungsi tombol Undo adalah untuk menghapus
	 * satu karakter dari layar
	 * 
	 * @param screen
	 * @param history
	 */
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(screen, history)) {
			String show = screen.getShow().substring(0, screen.getShow().length() - 1);
			screen.setShow(show);
		}
	}
}
