class MRButton extends SpecialButton{
  MRButton(float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super("MR", positionX, positionY, sizeX, sizeY, rgb);
  }
  
  boolean isAvailable(){
    if(history.size() == 0){
      return false;
    }
    return true;
  }
  
  @Override
  void function(){
    if(this.isAvailable()){
      screen.addShow(history.remove());
    }
  }
}
