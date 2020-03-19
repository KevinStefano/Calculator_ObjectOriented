package button;

import processing.core.PApplet;
import processing.core.PConstants;
import screen.Screen;

public class Operator extends Button{
	private int priority;
	private String operator;
	private int r, g, b;
	
	public Operator(PApplet papplet, String operator, int priority, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, positionX, positionY, sizeX, sizeY, r, g, b);
		this.priority = priority;
		this.operator = operator;
	}
	
	@Override
	public String getValue() {
		return this.operator;
	}
	
	@Override
	public int getPriority() {
		return this.priority;
	}
	
	@Override
	public void addText(Screen screen) {
		screen.addShow(this.operator);
	}
	
	@Override
	public void render() {
		super.render();
		papplet.textSize(15);
		papplet.fill(this.r, this.g, this.b);
		papplet.textAlign(PConstants.CENTER, PConstants.CENTER);
		papplet.text(this.operator, (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
