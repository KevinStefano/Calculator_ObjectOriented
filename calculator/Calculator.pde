import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

ArrayList<Button> button = new ArrayList<Button>();
Show screen = new Show();

void setup(){
  size(360, 640);
  
  Calculate A = new Calculate("123*43-23+43");
  println(A.answer());
  
  float plusHeight = 0;
  float timesWidth = 0;
  for(int i = 0; i < 9; i++){
    if(i != 0 && i % 3 == 0){
      plusHeight += 50;
      timesWidth = 0;
    }
    button.add(new Button(str(i+1), timesWidth*50, (height-50) - plusHeight, 50, 50, 255));
    timesWidth++;
  }
}

void draw(){
  background(255);
  for(int i = 0; i < 9; i++){
    button.get(i).update();
    button.get(i).render();
  }
  screen.update();
}

void mouseClicked(){
  for(int i = 0; i < 9; i++){
    if(button.get(i).isClicked()){
      println(button.get(i).getValue());  
      button.get(i).addText();
    }
  }
}

void keyTyped(){
  println(key);
  String a = "";
  if(isNumber(key) || isOperand(key)){
    a += key;
  }
  screen.addShow(a);
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
  if(temp >= 40 && temp <= 47){
    return true;
  }
  return false;
}
