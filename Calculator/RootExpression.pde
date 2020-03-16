class RootExpression extends UnaryExpression {

  RootExpression(Expression x){
    super(x);
  }
  
  double solve(){
    return Math.sqrt(this.x.solve());
  }
}
