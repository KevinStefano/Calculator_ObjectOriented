import java.util.*;

ArrayList<Button> button = new ArrayList<Button>();
ArrayList<SpecialButton> specialButton = new ArrayList<SpecialButton>();
Screen screen = new Screen();
Parser2 parser = new Parser2();
Queue<String> history = new LinkedList<String>();
PImage pim;

void setup(){
  frameRate(60);
  size(351, 650);
  
  float plusHeight = 0;
  float timesWidth = 0;
  for(int i = 0; i < 9; i++){
    if(i != 0 && i % 3 == 0){
      //plusHeight += 50;
      plusHeight += 70;
      timesWidth = 0;
    }
    button.add(new Number(str(i+1), timesWidth*70, (height-140) - plusHeight, 70, 70, 0));
    timesWidth++;
  }
  button.add(new Number("0", 0, (height-70), 70, 70, 0));
  button.add(new Number(".", 70, (height-70), 70, 70, 0));
  button.add(new Equal(140, height-70, 70, 70, 255));
  
  specialButton.add(new MCButton(0, height-350, 70, 70, #CC6600));
  specialButton.add(new MRButton(70, height-350, 70, 70, #CC6600));
  specialButton.add(new UndoButton(140, height-350, 70, 70, #CC6600));
  specialButton.add(new ClearButton(210, height-350, 70, 70, #CC6600));
  
  
  button.add(new Operator("+", 1, 210, (height-70), 70, 70, 255));
  button.add(new Operator("-", 1, 210, (height-140), 70, 70, 255));
  button.add(new Operator("*", 1, 210, (height-210), 70, 70, 255));
  button.add(new Operator("/", 2, 210, (height-280), 70, 70, 255));

  button.add(new Operator("√", 2, 280, (height-70), 70, 70, 255));
  button.add(new Operator("^", 3, 280, (height-140), 70, 70, 255));
  button.add(new Operator("sin", 3, 280, (height-210), 70, 70, 255));
  button.add(new Operator("cos", 3, 280, (height-280), 70, 70, 255));
  button.add(new Operator("tan", 3, 280, (height-350), 70, 70, 255));
  
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

//void calculate(){
//  char temp_op;
//  double num_1, num_2;
//  while(parser.operator.size() > 0){
//    temp_op = parser.operator.remove();
//    if(temp_op == '+'){
//      num_1 = parser.number.remove();
//      num_2 = parser.number.remove();
//      Expression e = new AddExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
//      parser.number.push(e.solve());
//    }
//    else if(temp_op == '-'){
//      num_1 = parser.number.remove();
//      num_2 = parser.number.remove();
//      Expression e = new SubstractExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
//      parser.number.push(e.solve());
//    }
//    else if(temp_op == '*'){
//      num_1 = parser.number.remove();
//      num_2 = parser.number.remove();
//      Expression e = new MultiplyExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
//      parser.number.push(e.solve());
//    }
//    else if(temp_op == '/'){
//      num_1 = parser.number.remove();
//      num_2 = parser.number.remove();
//      Expression e = new DivideExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
//      parser.number.push(e.solve());
//    }
//    else if(temp_op == '^'){
//      num_1 = parser.number.remove();
//      num_2 = parser.number.remove();
//      Expression e = new PowExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
//      parser.number.push(e.solve());
//    }
//      else if(temp_op == '√'){
//      num_1 = parser.number.remove();
//      Expression e = new RootExpression(new TerminalExpression(num_1));
//      parser.number.push(e.solve());
//    }
//    else if(temp_op == 'c'){
//      num_1 = parser.number.remove();
//      temp_op = parser.operator.remove();
//      temp_op = parser.operator.remove();
//      Expression e = new CosExpression(new TerminalExpression(num_1));
//      parser.number.push(e.solve());
//    }
//    else if(temp_op == 's'){
//      num_1 = parser.number.remove();
//      temp_op = parser.operator.remove();
//      temp_op = parser.operator.remove();
//      Expression e = new SinExpression(new TerminalExpression(num_1));
//      parser.number.push(e.solve());
//    }
    
//    else if(temp_op == 't'){
//      num_1 = parser.number.remove();
//      temp_op = parser.operator.remove();
//      temp_op = parser.operator.remove();
//      Expression e = new TanExpression(new TerminalExpression(num_1));
//      parser.number.push(e.solve());
//    }
//  }
//}

void mouseClicked(){
  for(int i = 0; i < button.size(); i++){
    if(button.get(i).onHover()){
      try{
        button.get(i).addText();
      }
      catch (Exception e){
        println(e);
      }
      if(button.get(i).getValue().equals("=")){
        //parser.parsing(screen.getShow());
        //calculate();
        screen.setShow(String.valueOf(parser.parse(split(screen.getShow(),'=')[0]).solve()));
      }
    }
  }
  for(int i = 0; i < specialButton.size(); i++){
    if(specialButton.get(i).onHover()){
      if(specialButton.get(i).getValue().equals("MC")){
        specialButton.get(i).function();
      }
      else if(specialButton.get(i).getValue().equals("MR")){
        specialButton.get(i).function();
      }
      else if(specialButton.get(i).getValue().equals("AC")){
        screen.setShow(String.valueOf(""));
      }
      else if(specialButton.get(i).getValue().equals("<-")){
        String temp = screen.getShow();
        String show = "";
        if(temp.length() > 0){
          show = temp.substring(0, temp.length() - 1);
        }
        screen.setShow(String.valueOf(show));
      }
    }
  }
}
