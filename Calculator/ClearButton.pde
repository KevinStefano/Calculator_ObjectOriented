class ClearButton extends SpecialButton{
  ClearButton(float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super("Clear", positionX, positionY, sizeX, sizeY, rgb);
  }
  
  boolean isAvailable(){
    if(screen.getShow().length()!=0){
      return false;
    }
    return true;
  }
  
  @Override
  void function(){
    if(this.isAvailable()){
      println("DELETE");
    }
  }
}
