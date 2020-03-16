class Calculate{
  
  Stack<Double> stack;
  Stack<Character> operator;
  ArrayList<String> list;
  
  Calculate(){
    stack = new Stack<Double>();
    operator = new Stack<Character>();
    list = new ArrayList<String>();
  }
  
  Calculate(String input){
    stack = new Stack<Double>();
    operator = new Stack<Character>();
    list = new ArrayList<String>();
    
    String number = "";
    for(int i = 0; i < input.length(); i++){
      if(this.isNumber(input.charAt(i)) || input.charAt(i) == '.'){
        number += input.charAt(i);
      }
      else{
        list.add(number);
        number = "";
        number += input.charAt(i);
        list.add(number);
        number = "";
      }
    }
    if(number.length() == 0){
      number += input.charAt(input.length());
    }
    list.add(number);
  }
  
  Double answer(){
    for(int i = 0; i < this.list.size(); i++){
      if(this.isOperand(this.list.get(i).charAt(0))){
        operator.add(list.get(i).charAt(0));
      }
      else{
        stack.add(Double.parseDouble(list.get(i)));
      }
      this.checkpoint(stack,operator,this.nextOp(i));
    }
    this.checkpoint(stack,operator,'0');
    println("ANJIR");
    return stack.pop();
  }
  
  char nextOp(int now){
    for(int i = now; i < this.list.size(); i++){
      if(this.isOperand(this.list.get(i).charAt(0))){
        return (this.list.get(i).charAt(0));
      }
    }
    return 0;
  }
  
  void checkpoint(Stack<Double> stack, Stack<Character> operator, char nextOp){
    while(stack.size() > 1 && operator.size() > 0){
      println("Kiri " + this.priorityOp(operator.peek()));
      println("Kanan " + this.priorityOp(nextOp));
      if(this.priorityOp(operator.peek()) > this.priorityOp(nextOp)){
        double num_2 = stack.pop();
        double num_1 = stack.pop();
        char op = operator.pop();
        double ans = this.operator(op, num_1, num_2);
        stack.push(ans);
      }
      else{
        break;
      }
    }
  }
  
  int priorityOp(char a){
    if(a == '+' || a == '-'){
      return 1;
    }
    else if(a == '*' || a == '/'){
      return 2;
    }
    else if(a == '^'){
      return 3;
    }
    return 0;
  }
  
  boolean isOperand(char a){
    int temp = (int) a;
    if(temp >= 40 && temp <= 47 || temp == 94){
      return true;
    }
    return false;
  }
  
  boolean isNumber(char a){
    int temp = (int) a;
    if(temp >= 48 && temp <= 57){
      return true;
    }
    return false;
  }
  
  double operator(char op, double num_1, double num_2){
    double result = 0;
    
    if(op == '+'){
      result = num_1 + num_2;
    }
    else if(op == '-'){
      result = num_1 - num_2;
    }
    else if(op == '*'){
      result = num_1 * num_2;
    }
    else if(op == '/'){
      result = num_1 / num_2;
    }
    else if(op == '^'){
      result = Math.pow(num_1, num_2);
    }
   
    return result;
  }
  
}
