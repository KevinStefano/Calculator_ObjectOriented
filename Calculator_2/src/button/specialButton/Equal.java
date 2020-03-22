package button.specialButton;

import java.util.Queue;

import calculate.Calculate;
import checker.CheckAll;
import processing.core.*;
import screen.Screen;

public class Equal extends SpecialButton{
	
	private double ans;
	
	public Equal(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "=", positionX, positionY, sizeX, sizeY, r, g, b);
		this.ans = -923485;
	}
	
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		return true;
	}
	
	@Override
	public void function(Screen screen, Queue<String> history) {
		CheckAll checker = new CheckAll();
		Calculate calculate = new Calculate();
		try {
			checker.check(screen.getShow());
			String answer = calculate.calculate(screen.getShow(), this.ans);
			screen.setShow(answer);
			this.ans = Double.parseDouble(answer);
		}
		catch(Exception e) {
			System.out.println(e);
			screen.setShow("Error");
		}
	}
	
	@Override
	public void render() {
		super.render();
		papplet.textSize(15);
		papplet.fill(15);
		papplet.textAlign(PConstants.CENTER, PConstants.CENTER);
		papplet.text(this.getValue(), (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
