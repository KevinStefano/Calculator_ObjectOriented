package screen;

import processing.core.*;

public class Screen {
	
	/**
	 * Class Screen 
	 * untuk membuat layar pada aplikasi
	 */
	
	PApplet papplet;
	String show;
	
	/**
	 * Constructor pembentuk Screen
	 * 
	 * @param papplet (processing sketch)
	 */
	public Screen(PApplet papplet) {
		this.show = "";
		this.papplet = papplet;
	}
	
	/**
	 * Method untuk merubah String yang ditampilkan
	 * 
	 * @param c (String yang akan ditampilkan)
	 */
	public void setShow(String c) {
		this.show = c;
	}

	/**
	 * Method untuk merubah String yang ditampilkan
	 * 
	 * @param c (Karakter yang akan ditampilkan)
	 */
	public void setShow(char c) {
		this.show = Character.toString(c);
	}

	/**
	 * Method untuk merubah String yang ditampilkan
	 * 
	 * @param c (Integer yang akan ditampilkan)
	 */
	public void setShow(int c) {
		this.show = Integer.toString(c); 
	}
	
	/**
	 * Method untuk menambahkan String yang ditampilkan
	 * 
	 * @param c (String yang akan ditambahkan)
	 */
	public void addShow(String c) {
		this.show += c;
	}

	/**
	 * Method untuk menambahkn String yang ditampilkan
	 * 
	 * @param c (Karakter yang akan ditambahkan)
	 */
	public void addShow(char c) {
		this.show += Character.toString(c);
	}

	/**
	 * Method untuk menambahkan String yang akan ditampilkan
	 * 
	 * @param c (Integer yang akan ditambahkan)
	 */
	public void addShow(int c) {
		this.show += Integer.toString(c);
	}
	
	/**
	 * Method untuk mendapatkan tampilan layar
	 * 
	 * @return String
	 */
	public String getShow() {
		return this.show;
	}
	
	/**
	 * Method untuk melakukan rendering update pada aplikasi
	 */
	public void update() {
		papplet.textSize(30);
		papplet.fill(0);
		papplet.textAlign(PConstants.RIGHT, PConstants.RIGHT);
		
		// Margin
		papplet.fill(204, 102, 0);
		papplet.text(this.show, papplet.width - 10, papplet.height/2 - 60);
	}
}
