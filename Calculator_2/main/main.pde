import java.util.*;
import button.Number;
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
Calculate calculate = new Calculate();
Checker check = new Checker();
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
  button.add(new Equal(this, 140, height-70, 70, 70, 255, 255, 255));
  
  specialButton.add(new MCButton(this, 0, height-350, 70, 70, 204, 102, 0));
  specialButton.add(new MRButton(this, 70, height-350, 70, 70, 204, 102, 0));
  specialButton.add(new UndoButton(this, 140, height-350, 70, 70, 204, 102, 0));
  specialButton.add(new ClearButton(this, 210, height-350, 70, 70, 204, 102, 0));
  
  
  button.add(new Operator(this, "+", 1, 210, (height-70), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "-", 1, 210, (height-140), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "*", 1, 210, (height-210), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "/", 2, 210, (height-280), 70, 70, 255, 255, 255));

  button.add(new Operator(this, "√", 2, 280, (height-70), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "^", 3, 280, (height-140), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "sin", 3, 280, (height-210), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "cos", 3, 280, (height-280), 70, 70, 255, 255, 255));
  button.add(new Operator(this, "tan", 3, 280, (height-350), 70, 70, 255, 255, 255));
  
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
}

void mouseClicked(){
  for(int i = 0; i < button.size(); i++){
    if(button.get(i).onHover()){
      try{
        button.get(i).addText(screen);
      }
      catch (Exception e){
        println(e);
      }
      if(button.get(i).getValue().equals("=")){
        if(check.check(screen.getShow())){
          screen.setShow(calculate.calculate(screen.getShow()));
        }
        else {
          screen.setShow("Error");
        }
      }
    }
  }
  for(int i = 0; i < specialButton.size(); i++){
    if(specialButton.get(i).onHover()){
      if(specialButton.get(i).getValue().equals("MC")){
        specialButton.get(i).function(screen, history);
      }
      else if(specialButton.get(i).getValue().equals("MR")){
        specialButton.get(i).function(screen, history);
      }
      else if(specialButton.get(i).getValue().equals("AC")){
        screen.setShow("");
      }
      else if(specialButton.get(i).getValue().equals("<-")){
        String temp = screen.getShow();
        String show = "";
        if(temp.length() > 0){
          show = temp.substring(0, temp.length() - 1);
        }
        screen.setShow(show);
      }
    }
  }
}
