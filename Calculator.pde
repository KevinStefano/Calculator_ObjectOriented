import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

ArrayList<Button> button = new ArrayList<Button>();
Show screen = new Show();

void setup(){
  frameRate(60);
  size(360, 640);
  
  float plusHeight = 0;
  float timesWidth = 0;
  for(int i = 0; i < 9; i++){
    if(i != 0 && i % 3 == 0){
      plusHeight += 50;
      timesWidth = 0;
    }
    button.add(new Button(str(i+1), timesWidth*50, (height-100) - plusHeight, 50, 50, 255));
    timesWidth++;
  }
  button.add(new Button("0", 0, (height-50), 50, 50, 255));
  button.add(new Button("00", 50, (height-50), 50, 50, 255));
  button.add(new Button(".", 100, (height-50), 50, 50, 255));
  button.add(new Button("+", 150, (height-100), 50, 100, 255));
  button.add(new Button("-", 150, (height-150), 50, 50, 255));
  button.add(new Button("*", 150, (height-200), 50, 50, 255));
  button.add(new Button("/", 200, (height-200), 50, 50, 255));
  button.add(new Button("^", 200, (height-150), 50, 50, 255));
  button.add(new Button("=", 200, (height-100), 50, 50, 255));
}

void draw(){
  background(255);
  for(int i = 0; i < button.size(); i++){
    button.get(i).update();
    button.get(i).render();
  }
  screen.update();
}

void mouseClicked(){
  for(int i = 0; i < button.size(); i++){
    if(button.get(i).isClicked()){
      println(button.get(i).getValue());  
      if(button.get(i).getValue().charAt(0) == '='){
        Calculate calculator = new Calculate(screen.getShow());
        String a = String.valueOf(calculator.answer());
        screen.setShow(a);
      }
      button.get(i).addText();
    }
  }
}

void keyTyped(){
  println(key);
  String a = "";
  if(isNumber(key) || isOperand(key)){
    a += key;
    screen.addShow(a);
  }
  else if(key == '='){
    Calculate calculator = new Calculate(screen.getShow());
    println("ANJIR");
    a = String.valueOf(calculator.answer());
    println("anjir");
    screen.setShow(a);
  }
}

boolean isNumber(char a){
  int temp = (int) a;
  if(temp >= 48 && temp <= 57){
    return true;
  }
  return false;
}

boolean isOperand(char a){
  int temp = (int) a;
  if(temp >= 40 && temp <= 47 || temp == 94){
    return true;
  }
  return false;
}
