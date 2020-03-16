import java.util.*;

ArrayList<Button> button = new ArrayList<Button>();
Screen screen = new Screen();
Parser parser = new Parser();

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
    button.add(new Number(str(i+1), timesWidth*50, (height-100) - plusHeight, 50, 50, 255));
    timesWidth++;
  }
  button.add(new Number("0", 0, (height-50), 50, 50, 255));
  button.add(new Number("00", 50, (height-50), 50, 50, 255));
  button.add(new Number(".", 100, (height-50), 50, 50, 255));
  button.add(new Operator("+", 1, 150, (height-100), 50, 100, 255));
  button.add(new Operator("-", 1, 150, (height-150), 50, 50, 255));
  button.add(new Operator("*", 2, 150, (height-200), 50, 50, 255));
  button.add(new Operator("/", 2, 200, (height-150), 50, 50, 255));
  button.add(new Operator("^", 3, 200, (height-100), 50, 50, 255));
  button.add(new Operator("sin", 3, 250, (height-50), 50, 50, 255));
  button.add(new Operator("cos", 3, 250, (height-100), 50, 50, 255));
  button.add(new Operator("tan", 3, 250, (height-150), 50, 50, 255));
  button.add(new Equal(200, (height-50), 50, 50, 255));
}

void draw(){
  background(255);
  for(int i = 0; i < button.size(); i++){
    button.get(i).render();
  }
  screen.update();
}

void calculate(){
  char temp_op;
  double num_1, num_2;
  while(parser.operator.size() > 0){
    temp_op = parser.operator.remove();
    if(temp_op == '+'){
      num_1 = parser.number.remove();
      num_2 = parser.number.remove();
      Expression e = new AddExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
      parser.number.push(e.solve());
    }
    else if(temp_op == '-'){
      num_1 = parser.number.remove();
      num_2 = parser.number.remove();
      Expression e = new SubstractExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
      parser.number.push(e.solve());
    }
    else if(temp_op == '*'){
      num_1 = parser.number.remove();
      num_2 = parser.number.remove();
      Expression e = new MultiplyExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
      parser.number.push(e.solve());
    }
    else if(temp_op == '/'){
      num_1 = parser.number.remove();
      num_2 = parser.number.remove();
      Expression e = new DivideExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
      parser.number.push(e.solve());
    }
    else if(temp_op == '^'){
    num_1 = parser.number.remove();
    num_2 = parser.number.remove();
    Expression e = new PowExpression(new TerminalExpression(num_1), new TerminalExpression(num_2));
    parser.number.push(e.solve());
    }
    else if(temp_op == 'c'){
    num_1 = parser.number.remove();
    temp_op = parser.operator.remove();
    temp_op = parser.operator.remove();
    Expression e = new CosExpression(new TerminalExpression(num_1));
    parser.number.push(e.solve());
    }
    else if(temp_op == 's'){
    num_1 = parser.number.remove();
    temp_op = parser.operator.remove();
    temp_op = parser.operator.remove();
    Expression e = new SinExpression(new TerminalExpression(num_1));
    parser.number.push(e.solve());
    }
    
    else if(temp_op == 't'){
    num_1 = parser.number.remove();
    temp_op = parser.operator.remove();
    temp_op = parser.operator.remove();
    Expression e = new TanExpression(new TerminalExpression(num_1));
    parser.number.push(e.solve());
    }
 
  }
}

void mouseClicked(){
  for(int i = 0; i < button.size(); i++){
    if(button.get(i).onHover()){
      screen.addShow(button.get(i).getValue());
      if(button.get(i).getValue().charAt(0) == '='){
        parser.parsing(screen.getShow());
        calculate();
        screen.setShow(String.valueOf(parser.number.pollFirst()));
      }
    }
  }
}
