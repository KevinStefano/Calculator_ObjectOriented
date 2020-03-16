abstract class BinaryExpression extends Expression{
  Expression x;
  Expression y;
  
  BinaryExpression(Expression x, Expression y){
    super();
    this.x = x;
    this.y = y;
  }
  
  abstract double solve();
}
