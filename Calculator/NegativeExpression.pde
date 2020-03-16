class NegativeExpression extends UnaryExpression{
  NegativeExpression(Expression x){
    super(x);
  }
  
  double solve(){
    return -(this.x.solve());
  }
}
