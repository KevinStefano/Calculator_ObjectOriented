class Parser{
  Deque<Double> number;
  Queue<Character> operator;
  
  Parser(){
    number = new ArrayDeque<Double>();
    operator = new LinkedList<Character>();
  }
  
  void parsing(String input){
    String temp_num = "";
    for(int i = 0; i < input.length(); i++){
      
      if(isNumber(input.charAt(i))){
        temp_num += input.charAt(i);
      }
      else{
        this.operator.add(input.charAt(i));
        if(!temp_num.equals("")){
          this.number.add(Double.parseDouble(temp_num));
        }
        temp_num = "";
      }
    }
  }
  
  boolean isNumber(char check){
    int temp = (int) check;
    if(temp >= 48 && temp <= 57 || temp == 46){
      return true;
    }
    return false;
  }
}
