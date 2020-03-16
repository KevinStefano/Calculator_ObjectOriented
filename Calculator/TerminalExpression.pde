class TerminalExpression extends Expression{
  double x;
  
  TerminalExpression(double x){
    super();
    this.x = x;
  }
  
  double solve(){
    return this.x;
  }
}
