package button.specialButton;

import processing.core.*;
import screen.*;
import java.util.*;

public class UndoButton extends SpecialButton{
	
	public UndoButton(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "<-", positionX, positionY, sizeX, sizeY, r, g, b);
	}
	
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		if(screen.getShow().length() != 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public void function(Screen screen, Queue<String> history) {
		if(this.isAvailable(screen, history)) {
			// CODE
		}
	}
}
