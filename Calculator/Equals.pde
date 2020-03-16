class Equal extends Button{
  String value;
  
  public Equal(float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super(positionX, positionY, sizeX, sizeY, rgb);
    this.value = "=";
  }
  
  String getValue(){
    return this.value;
  }
  
  public int getPriority() throws PriorityException{
    throw(new PriorityException("Priority Not Found"));
  }
  
  void addText(){
    screen.addShow(this.value);
  }
  
  @Override
  void render(){
    super.render();
    textSize(15);
    fill(0);
    textAlign(CENTER, CENTER);
    text(this.value, (positionX+sizeX/2), (positionY+sizeY/2));
  }
}
