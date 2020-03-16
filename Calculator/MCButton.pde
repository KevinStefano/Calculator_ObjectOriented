class MCButton extends SpecialButton{
  MCButton(float positionX, float positionY, float sizeX, float sizeY, color rgb){
    super("MC", positionX, positionY, sizeX, sizeY, rgb);
  }
  
  private boolean isOperand(char check){
    int temp = (int) check;
    if((temp >= 40 && temp <= 45) || temp == 94){
      return true;
    }
    return false;
  }
  
  private boolean isIncludeOperand(String input){
    for(int i = 0; i < input.length(); i++){
      println(input.charAt(i));
      if(isOperand(input.charAt(i))){
        return true;
      }
    }
    return false;
  }
  
  boolean isAvailable(){
    if(this.isIncludeOperand(screen.getShow())){
      return false;
    }
    return true;
  }
  
  @Override
  void function(){
    if(this.isAvailable()){
      println("TRUE");
      history.add(screen.getShow());
    }
  }
}
