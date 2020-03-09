class Button{
  
  // Value
  String value;
  
  // Position
  float positionX;
  float positionY;
  
  // Size
  float sizeX;
  float sizeY;
  
  // Mouse Binding
  boolean pressed;
  
  // Color
  color rgb;
  
  Button(String value, float positionX, float positionY, float sizeX, float sizeY, color rgb){
    this.positionX = positionX;
    this.positionY = positionY;
    this.sizeX = sizeX;
    this.sizeY = sizeY;
    this.value = value;
    this.pressed = false;
    this.rgb = color(rgb);
    fill(255);
    rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
    textSize(15);
    fill(0);
    textAlign(CENTER, CENTER);
    text(value, (positionX+sizeX/2), (positionY+sizeY/2));
  }
  
  String getValue(){
    return this.value;
  }
  
  void update(){
    if(mousePressed == true && mouseButton == LEFT && pressed == false){
      if(mouseX >= this.positionX && mouseX <= this.positionX + this.sizeX && mouseY >= this.positionY && mouseY <= this.positionY + this.sizeY){
        this.pressed = true;
      }
    }
    else{
      this.pressed = false;
    }
  }
  
  void render(){
    if(this.mouseOver()){
      fill(100);
      rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
      textSize(15);
      fill(0);
      textAlign(CENTER, CENTER);
      text(value, (positionX+sizeX/2), (positionY+sizeY/2));
    }
    else{
      fill(255);
      rect(this.positionX, this.positionY, this.sizeX, this.sizeY);
      textSize(15);
      fill(0);
      textAlign(CENTER, CENTER);
      text(value, (positionX+sizeX/2), (positionY+sizeY/2));
    }
  }
  
  boolean isClicked(){
    return this.pressed;
  }
  
  boolean mouseOver(){
    if(mouseX >= this.positionX && mouseX <= this.positionX + this.sizeX && mouseY >= this.positionY && mouseY <= this.positionY + this.sizeY){
      return true;
    }
    return false;
  }
  
  void addText(){
    if(this.pressed){
      screen.addShow(this.value);
    }
  }
}
