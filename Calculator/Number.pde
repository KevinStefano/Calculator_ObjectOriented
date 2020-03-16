class Number extends Button{
  private String number;
  
  Number(String number, float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super(positionX, positionY, sizeX, sizeY, rgb);
    this.number = number;
  }
  
  public String getValue(){
    return this.number;
  }
  
  public int getPriority() throws PriorityException{
    throw(new PriorityException("Priority Not Found"));
  }
  
  void addText(){
    screen.addShow(this.number);
  }
  
  @Override
  void render(){
    super.render();
    textSize(15);
    fill(0);
    textAlign(CENTER, CENTER);
    text(number, (positionX+sizeX/2), (positionY+sizeY/2));
  }
}
