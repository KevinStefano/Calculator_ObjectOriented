abstract class Button{
  
  // Position
  float positionX;
  float positionY;
  
  // Size
  float sizeX;
  float sizeY;  
  
  // Color
  color rgb;
  
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
      this.rgb = color(100);
    }
    else{
      this.rgb = color(255);
    }
  }
  
  void render(){
    this.setColor();
    fill(this.rgb);
    rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
  }
  
  // ABSTRACT METHOD
  abstract void addText();
  abstract String getValue();
  abstract int getPriority() throws PriorityException;
  //abstract String getType();
}
