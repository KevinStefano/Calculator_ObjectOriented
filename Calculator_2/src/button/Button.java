package button;

import processing.core.*;
import screen.Screen;

abstract public class Button {
	protected PApplet papplet;
	
	protected float positionX;
	protected float positionY;
	
	protected float sizeX;
	protected float sizeY;
	
	protected int r,g,b;
	protected int br, bg, bb;
	
	
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
	
	public void render() {
		this.setColor();
		papplet.fill(this.br, this.bg, this.bb);
		papplet.rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
	}
	
	abstract public void addText(Screen screen);
	abstract public String getValue();
	abstract public int getPriority();
}
