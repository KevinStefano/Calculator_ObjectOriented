import java.util.*;
import button.Number;
import button.specialButton.AnsButton;
import button.specialButton.MCButton;
import button.specialButton.MRButton;
import button.specialButton.UndoButton;
import button.specialButton.ClearButton;
import expression.*;
import screen.Screen;
import checker.Checker;
import calculate.Calculate;


ArrayList<Button> button = new ArrayList<Button>();
ArrayList<SpecialButton> specialButton = new ArrayList<SpecialButton>();
Screen screen = new Screen(this);
Queue<String> history = new LinkedList<String>();
double ans = -923485;
Calculate calculate = new Calculate();
CheckAll check = new CheckAll();
PImage pim;

void setup(){
  size(351, 650);
  surface.setTitle("GUI Calculator with OOP");
  surface.setLocation(400, 100);
  float plusHeight = 0;
  float timesWidth = 0;
  for(int i = 0; i < 9; i++){
    if(i != 0 && i % 3 == 0){
      plusHeight += 70;
      timesWidth = 0;
    }
    button.add(new Number(this, str(i+1), timesWidth*70, (height-140) - plusHeight, 70, 70, 0, 0, 0));
    timesWidth++;
  }
  button.add(new Number(this, "0", 0, (height-70), 70, 70, 0, 0, 0));
  button.add(new Number(this, ".", 70, (height-70), 70, 70, 0, 0, 0));
  
  specialButton.add(new Equal(this, 140, height-70, 70, 70, 255, 255, 255));
  specialButton.add(new MCButton(this, 0, height-350, 70, 70, 204, 102, 0));
  specialButton.add(new MRButton(this, 70, height-350, 70, 70, 204, 102, 0));
  specialButton.add(new UndoButton(this, 140, height-350, 70, 70, 204, 102, 0));
  specialButton.add(new ClearButton(this, 210, height-350, 70, 70, 204, 102, 0));  
  specialButton.add(new AnsButton(this, 280, height-350, 70, 70, 204, 102, 0));

  button.add(new Operator(this, "+", 210, (height-70), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "-", 210, (height-140), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "*", 210, (height-210), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "/", 210, (height-280), 70, 70, 255, 255, 255));

  button.add(new Operator(this, "√", 280, (height-56), 70, 56, 255, 255, 255));
  button.add(new Operator(this, "^", 280, (height-2*56), 70, 56, 255, 255, 255));
  button.add(new Operator(this, "sin", 280, (height-3*56), 70, 56, 255, 255, 255));
  button.add(new Operator(this, "cos", 280, (height-4*56), 70, 56, 255, 255, 255));
  button.add(new Operator(this, "tan", 280, (height-5*56), 70, 56, 255, 255, 255));

  pim = loadImage("calculator-logos.jpg");
}

void draw(){
  background(255);
  for(int i = 0; i < button.size(); i++){
    button.get(i).render();
  }
  for(int i = 0; i < specialButton.size(); i++){
    specialButton.get(i).render();
  }
  screen.update();
  image(pim,0,0,width,height/3);
  cursor(HAND);
}

void mouseClicked(){
  for(int i = 0; i < button.size(); i++){
    if(button.get(i).onHover()){
      button.get(i).addText(screen);
    }
  }
  for(int i = 0; i < specialButton.size(); i++){
    if(specialButton.get(i).onHover()){
      specialButton.get(i).function(screen, history);
    }
  }
}
