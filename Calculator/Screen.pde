class Screen{
  
  String show;
  
  Screen(){
    this.show = "";
  }
  
  void setShow(String c){
    this.show = c;
  }
  
  void addShow(String c){
    this.show += c;
  }
  
  String getShow(){
    return this.show;
  }
  
  void update(){
    textSize(30);
    fill(0);
    textAlign(RIGHT, RIGHT);
    //margin
    fill(204, 102, 0);
    text(this.show, width - 10, height/2 - 60);
  }
}
