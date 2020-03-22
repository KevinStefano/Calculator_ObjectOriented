package button;

import processing.core.*;
import screen.Screen;

abstract public class Button {
	
	/**
	 * Class Button 
	 * berfungsi untuk membuat tombol persegi panjang pada layar
	 * 
	 * Class ini terdiri dari beberapa method untuk membuat tombol,
	 * serta menandai apakah mouse sudah berada pada tombol tersebut
	 * atau tidak
	 */
	
	protected PApplet papplet;
	
	protected float positionX;
	protected float positionY;
	
	protected float sizeX;
	protected float sizeY;
	
	protected int r,g,b;
	protected int br, bg, bb;
	
	/**
	 * Constructor untuk membuat Button
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
	public Button(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b){
		this.papplet = papplet;
		this.positionX = positionX;
		this.positionY = positionY;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * 
	 * @return Mengembalikan boolean apakah mouse berada di dalam tombol
	 */
	public boolean onHover() {
		if	(	
			this.positionX <= papplet.mouseX && 
			this.positionX + this.sizeX >= papplet.mouseX && 
			this.positionY <= papplet.mouseY && 
			this.positionY + this.sizeY >= papplet.mouseY
			) {
			return true;
		}
		return false;
	}
	
	/**
	 * Merubah warna tombol
	 */
	void setColor() {
		if(this.onHover()) {
			if(this.r == 204 && this.g == 102 && this.b == 0){
				this.br = 0; this.bg = 0; this.bb = 0;
			}
			else {
				this.br = 204; this.bg = 102; this.bb = 0;
			}
		}
		else {
			this.br = 255; this.bg = 255; this.bb = 255;
		}
	}
	
	/**
	 * Melakukan rendering ke layar 
	 * (Membuat bangun dan memberi warna)
	 */
	public void render() {
		this.setColor();
		papplet.fill(this.br, this.bg, this.bb);
		papplet.rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
	}
	
	abstract public void addText(Screen screen);
	abstract public String getValue();
}
