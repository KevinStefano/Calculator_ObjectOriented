class CosExpression extends UnaryExpression {

  CosExpression(Expression x){
    super(x);
  }
  
  double solve(){
    return Math.cos(Math.toRadians(this.x.solve()));
  }
}
