abstract class SpecialButton extends Button{
  
  String val;
  
  SpecialButton(String val, float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super(positionX, positionY, sizeX, sizeY, rgb);
    this.val = val;
  }
  
  String getValue(){
    return this.val;
  }
  
  void addText() throws AddTextException{
    throw(new AddTextException("This Button Cannot Add Text"));
  }
  
  int getPriority() throws PriorityException{
    throw(new PriorityException("This Button Don't Have Priority"));
  }
  
  @Override
  void render(){
    super.render();
    textSize(15);
    fill(0);
    textAlign(CENTER, CENTER);
    text(val, (positionX+sizeX/2), (positionY+sizeY/2));
  }
  
  abstract boolean isAvailable();
  abstract void function();
}
