package screen;

import processing.core.*;

public class Screen {
	
	PApplet papplet;
	String show;
	
	public Screen(PApplet papplet) {
		this.show = "";
		this.papplet = papplet;
	}
	
	public void setShow(String c) {
		this.show = c;
	}
	
	public void addShow(String c) {
		this.show += c;
	}
	
	public String getShow() {
		return this.show;
	}
	
	public void update() {
		papplet.textSize(30);
		papplet.fill(0);
		papplet.textAlign(PConstants.RIGHT, PConstants.RIGHT);
		
		// Margin
		papplet.fill(204, 102, 0);
		papplet.text(this.show, papplet.width - 10, papplet.height/2 - 60);
	}
}
