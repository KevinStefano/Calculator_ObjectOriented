abstract class Button{
  
  // Position
  float positionX;
  float positionY;
  
  // Size
  float sizeX;
  float sizeY;  
  
  // Color
  color rgb;
  color background;
  
  Button(float positionX, float positionY, float sizeX, float sizeY, color rgb){
    this.positionX = positionX;
    this.positionY = positionY;
    this.sizeX = sizeX;
    this.sizeY = sizeY;
    this.rgb = rgb;
  }
  
  boolean onHover(){
    if(this.positionX <= mouseX && this.positionX + this.sizeX >= mouseX && this.positionY <= mouseY && this.positionY + this.sizeY >= mouseY){
      return true;
    }
    return false;
  }
  
  void setColor(){
    if(this.onHover()){
      if(this.rgb == #CC6600){
        this.background = color(0);
      }
      else{
        this.background = color(#CC6600);
      }
    }
    else{
      this.background = color(255);
    }
  }
  
  void render(){
    this.setColor();
    fill(this.background);
    rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
  }
  
  // ABSTRACT METHOD
  abstract void addText() throws AddTextException;
  abstract String getValue();
  abstract int getPriority() throws PriorityException;
  //abstract String getType();
}
