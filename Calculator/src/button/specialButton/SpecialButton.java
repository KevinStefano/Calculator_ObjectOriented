package button.specialButton;

import processing.core.*;
import button.Button;
import screen.*;
import java.util.*;

abstract public class SpecialButton extends Button{
	
	/**
	 * Class Special Button 
	 * untuk membuat tombol yang memiliki
	 * fungsi spesial dibandingkan tombol Number dan Operator
	 */
	
	String val;
	
	/**
	 * Constructor untuk membuat SpecialButton
	 * 
	 * @param papplet (Processing sketch) 
	 * @param val (Value button)
	 * @param positionX (Lokasi koordinat X pada layar)
	 * @param positionY (Lokasi koordinat Y pada layar)
	 * @param sizeX (Ukuran X pada layar)
	 * @param sizeY (Ukuran Y pada layar)
	 * @param r (Color red code)
	 * @param g (Color green code)
	 * @param b (Color blue code)
	 */
	public SpecialButton(PApplet papplet, String val, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.val = val;
	}
	
	/**
	 * @return Mengembalikan value tombol
	 */
	@Override
	public String getValue() {
		return this.val;
	}
	
	/**
	 * Menambahkan text ke layar
	 */
	@Override
	public void addText(Screen screen) {}
	
	/**
	 * Melakukan rendering ke layar
	 * (Menggambar, mewarnai, dan menampilkan tulisan)
	 */
	@Override
	public void render() {
		super.render();
		papplet.textSize(16);
		papplet.fill(this.r, this.g, this.b);
		papplet.text(this.val, (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
	
	abstract public boolean isAvailable(Screen screen, Queue<String> history);
	abstract public void function(Screen screen, Queue<String> history);
}
