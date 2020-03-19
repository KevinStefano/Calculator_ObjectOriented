package button.specialButton;

import processing.core.*;
import java.util.*;
import screen.*;

public class MCButton extends SpecialButton{
	
	public MCButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b){
		super(papplet, "MC", positionX, positionY, sizeX, sizeY, r, g, b);
	}
	
	private boolean isOperand(char check) {
		int temp = (int) check;
		if((temp >= 40 && temp <= 45) || temp == 94){
			return true;
		}
		return false;
	}
	
	private boolean isIncludeOperand(String input){
		for(int i = 0; i < input.length(); i++){
			if(isOperand(input.charAt(i))){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		if(this.isIncludeOperand(screen.getShow())) {
			return false;
		}
		return true;
	}
	
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(screen, history)) {
			history.add(screen.getShow());
		}
	}
}
