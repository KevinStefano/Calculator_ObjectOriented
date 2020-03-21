package button;

import processing.core.*;
import screen.Screen;

public class Number extends Button{
	
	private String number;
	private int r, g, b;
	
	public Number(PApplet papplet, String number, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.number = number;
	}
	
	@Override
	public String getValue() {
		return this.number;
	}
	
	@Override
	public void addText(Screen screen) {
		screen.addShow(this.number);
	}
	
	@Override
	public void render() {
		super.render();
		papplet.textSize(15);
		papplet.fill(this.r, this.g, this.b);
		papplet.textAlign(PConstants.CENTER, PConstants.CENTER);
		papplet.text(this.number, (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
