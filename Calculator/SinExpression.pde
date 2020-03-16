class SinExpression extends UnaryExpression {

  SinExpression(Expression x){
    super(x);
  }
  
  double solve(){
    return Math.sin(Math.toRadians(this.x.solve()));
  }
}
