abstract class UnaryExpression extends Expression{
  
  Expression x;
  
  UnaryExpression(Expression x){
    super();
    this.x = x;
  }
  
  abstract double solve();
}
