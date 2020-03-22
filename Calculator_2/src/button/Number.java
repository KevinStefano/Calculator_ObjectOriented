package button;

import processing.core.*;
import screen.Screen;

public class Number extends Button{
	
	/**
	 * Class Number 
	 * untuk mengisi angka ke Button
	 * 
	 * Class ini memiliki beberapa method yang bertujuan untuk
	 * menambahkan angka ke layar
	 */
	
	private String number;
	private int r, g, b;
	
	/**
	 * Constructor untuk membuat Number
	 * 
	 * @param papplet (Processing sketch) 
	 * @param number (Value angka)
	 * @param positionX (Lokasi koordinat X pada layar)
	 * @param positionY (Lokasi koordinat Y pada layar)
	 * @param sizeX (Ukuran X pada layar)
	 * @param sizeY (Ukuran Y pada layar)
	 * @param r (Color red code)
	 * @param g (Color green code)
	 * @param b (Color blue code)
	 */
	public Number(PApplet papplet, String number, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.number = number;
	}
	
	/**
	 * @return Mendapatkan angka pada button
	 */
	@Override
	public String getValue() {
		return this.number;
	}
	
	/**
	 * Menambahkan angka ke layar
	 * @param screen
	 */
	@Override
	public void addText(Screen screen) {
		screen.addShow(this.number);
	}
	
	/**
	 * Melakukan rendering ke layar
	 * (Memberi warna, membuat bangun, memberikan tulisan)
	 */
	@Override
	public void render() {
		super.render();
		papplet.textSize(15);
		papplet.fill(this.r, this.g, this.b);
		papplet.textAlign(PConstants.CENTER, PConstants.CENTER);
		papplet.text(this.number, (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
