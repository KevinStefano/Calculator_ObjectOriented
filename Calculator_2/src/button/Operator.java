package button;

import processing.core.PApplet;
import processing.core.PConstants;
import screen.Screen;

public class Operator extends Button{
	
	/**
	 * Class Operator 
	 * untuk mengisi operator ke Button
	 * 
	 * Class ini memiliki beberapa method yang bertujuan untuk
	 * menambahkan operator ke layar
	 */
	
	private String operator;
	private int r, g, b;
	
	/**
	 * Constructor untuk membuat Operator
	 * 
	 * @param papplet (Processing sketch) 
	 * @param operator (Value operator)
	 * @param positionX (Lokasi koordinat X pada layar)
	 * @param positionY (Lokasi koordinat Y pada layar)
	 * @param sizeX (Ukuran X pada layar)
	 * @param sizeY (Ukuran Y pada layar)
	 * @param r (Color red code)
	 * @param g (Color green code)
	 * @param b (Color blue code)
	 */
	public Operator(PApplet papplet, String operator, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.operator = operator;
	}
	
	/**
	 * @return Mendapatkan value operator pada button
	 */
	@Override
	public String getValue() {
		return this.operator;
	}
	
	/**
	 * Menambahkan operator pada layar
	 * @param screen
	 */
	@Override
	public void addText(Screen screen) {
		screen.addShow(this.operator);
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
		papplet.text(this.operator, (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
