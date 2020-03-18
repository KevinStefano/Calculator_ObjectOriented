class Number extends Button{
  private String number;
  
  private color col;
  
  Number(String number, float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super(positionX, positionY, sizeX, sizeY, rgb);
    this.number = number;
    this.col = rgb;
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
    fill(this.col);
    textAlign(CENTER, CENTER);
    text(number, (positionX+sizeX/2), (positionY+sizeY/2));
  }
}
