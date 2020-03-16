class TanExpression extends UnaryExpression {

  TanExpression(Expression x){
    super(x);
  }
  
  double solve(){
    return Math.tan(Math.toRadians(this.x.solve()));
  }
}
