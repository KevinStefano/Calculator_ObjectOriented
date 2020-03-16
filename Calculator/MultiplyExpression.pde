class MultiplyExpression extends BinaryExpression {

  MultiplyExpression(Expression x, Expression y){
    super(x, y);
  }
  
  double solve(){
    return this.x.solve() * this.y.solve();
  }
}
