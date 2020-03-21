package button.specialButton;

import processing.core.*;
import button.Button;
import screen.*;
import java.util.*;

abstract public class SpecialButton extends Button{
	
	String val;
	
	public SpecialButton(PApplet papplet, String val, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.val = val;
	}
	
	@Override
	public String getValue() {
		return this.val;
	}
	
	@Override
	public void addText(Screen screen) {}
	
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
