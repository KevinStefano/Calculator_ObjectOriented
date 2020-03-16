class Operator extends Button{
  private int priority;
  private String operator;
  
  Operator(String operator, int priority, float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super(positionX, positionY, sizeX, sizeY, rgb);
    this.priority = priority;
    this.operator = operator;
  }
  
  public int getPriority(){
    return this.priority;
  }
  
  public String getValue(){
    return this.operator;
  }
  
  void addText(){
    screen.addShow(this.operator);
  }
  
  @Override
  void render(){
    super.render();
    textSize(15);
    fill(0);
    textAlign(CENTER, CENTER);
    text(this.operator, (positionX+sizeX/2), (positionY+sizeY/2));
  }
  
  //abstract double solve(double number1, double number2);
  //abstract double solve(double number1) throws OperatorException;
}
