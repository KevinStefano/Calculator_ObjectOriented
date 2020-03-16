class Show{
  
  String show;
  
  Show(){
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
    textAlign(CENTER, CENTER);
    text(this.show, width/2, height/2);
  }
}
