package button;

import processing.core.*;
import screen.Screen;

public class Equal extends Button{
	
	String value;
	
	public Equal(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.value = "=";
	}
	
	@Override
	public String getValue() {
		return this.value;
	}
	
	@Override
	public int getPriority() {return 0;}
	
	@Override
	public void addText(Screen screen) {
		screen.addShow(this.value);
	}
	
	@Override
	public void render() {
		super.render();
		papplet.textSize(15);
		papplet.fill(15);
		papplet.textAlign(PConstants.CENTER, PConstants.CENTER);
		papplet.text(this.value, (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
