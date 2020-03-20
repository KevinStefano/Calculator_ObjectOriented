package parser;

import expression.Expression;
import expression.TerminalExpression;
import expression.binary.*;
import expression.unary.*;
import java.util.*;

public class Parser {  
	  
	public Expression parse(String Masukan){
	    
	    String temp = "";
	    Queue<Expression> num = new LinkedList<Expression>(); 
	    Queue<String> op = new LinkedList<String>();
	    
	    for(char a : Masukan.toCharArray()){
	      if(a=='+'){
	        
	        op.add("+");
	        if(isNumber(temp)){
	          num.add(new TerminalExpression(Double.parseDouble(temp)));
	        }
	        else{
	          num.add(parseMulDiv(temp));
	        }
	        temp="";
	      }
	      else if(a=='-'){
	        op.add("-");
	        if(isNumber(temp)){
	          num.add(new TerminalExpression(Double.parseDouble(temp)));
	        }
	        else{
	          num.add(parseMulDiv(temp));
	        }
	        temp="";
	      }
	      else{
	        temp+=a;
	      }
	    }
	    if(isNumber(temp)){
	      num.add(new TerminalExpression(Double.parseDouble(temp)));
	    }
	    else{
	      num.add(parseMulDiv(temp));
	    }
	    if(op.size()!=0){
	      String endOP = op.remove();
	      Expression end,tempEx;
	      if(endOP=="+"){
	        Expression a = num.remove();
	        end = new AddExpression(a,num.remove());
	      }
	      else{
	        Expression a = num.remove();
	        end = new SubstractExpression(a,num.remove());
	      }
	      while(op.size()!=0){
	        endOP = op.remove();
	        if(endOP=="+"){
	          tempEx = new AddExpression(end,num.remove());
	        }
	        else{
	          tempEx = new SubstractExpression(end,num.remove());
	        }
	        end = tempEx;
	      }
	      return end;
	    }
	    else{
	      return parseMulDiv(Masukan);
	    }
	  }
	  
	  public Expression parseMulDiv(String Masukan){
	    
	    String temp = "";
	    Queue<Expression> num = new LinkedList<Expression>(); 
	    Queue<String> op = new LinkedList<String>();
	    
	    for(char a : Masukan.toCharArray()){
	      if(a=='*'){
	        op.add("*");
	        if(isNumber(temp)){
	          num.add(new TerminalExpression(Double.parseDouble(temp)));
	        }
	        else{
	          num.add(parsePowRoot(temp));
	        }
	        temp="";
	      }
	      else if(a=='/'){
	        op.add("/");
	        if(isNumber(temp)){
	          num.add(new TerminalExpression(Double.parseDouble(temp)));
	        }
	        else{
	          num.add(parsePowRoot(temp));
	        }
	        temp="";
	      }
	      else{
	        temp+=a;
	      }
	    }
	    
	    if(isNumber(temp)){
	      num.add(new TerminalExpression(Double.parseDouble(temp)));
	    }
	    else{
	      num.add(parsePowRoot(temp));
	    }
	    
	    if(op.size()!=0){
	      
	      String endOP = op.remove();
	      Expression end,tempEx;
	      
	      if(endOP=="*"){
	        Expression a = num.remove();
	        end = new MultiplyExpression(a,num.remove());
	      }
	      else{
	        Expression a = num.remove();
	        end = new DivideExpression(a,num.remove());
	      }
	      
	      while(op.size()!=0){
	        endOP = op.remove();
	        if(endOP=="*"){
	          tempEx = new MultiplyExpression(end,num.remove());
	        }
	        else{
	          tempEx = new DivideExpression(end,num.remove());
	        }
	        end = tempEx;
	      }
	      return end;
	    }
	    else{
	      return parsePowRoot(Masukan);
	    }
	  }
	  
	  public Expression parsePowRoot(String Masukan){
	    String temp = "";
	    String trigono = "";
	    Stack<TerminalExpression> num = new Stack<TerminalExpression>(); 
	    Stack<String> op = new Stack<String>();
	    for(char a : Masukan.toCharArray()){
	      if(a=='^'){
	        op.push("^");
	        num.push(new TerminalExpression(Double.parseDouble(temp)));
	        temp="";
	      }
	      else if(a=='√'){
	        op.push("√");
	        if(temp!=""){
	          num.push(new TerminalExpression(Double.parseDouble(temp)));
	        }
	        temp="";
	      }
	      else if(charNumber(a)){
	        temp+=a;
	        op.push(trigono);
	        trigono="";
	      }
	      else{
	        trigono+=a;
	      }
	    }
	    num.push(new TerminalExpression(Double.parseDouble(temp)));
	    String endOP = op.pop();
	    Expression end,tempEx;
	    
	    if(endOP=="√"){
	      end = new RootExpression(num.pop());
	    }
	    else if(endOP=="^"){
	      TerminalExpression a = num.pop();
	      end = new PowerExpression(num.pop(),a);
	    }
	    else if(endOP=="cos"){
	      TerminalExpression a = num.pop();
	      end = new CosExpression(a);
	    }
	    else if(endOP=="tan"){
	      TerminalExpression a = num.pop();
	      end = new TanExpression(a);
	    }
	    else{
	      TerminalExpression a = num.pop();
	      end = new SinExpression(a);
	    }
	    while(!op.empty()){
	      endOP = op.pop();
	      if(endOP=="√"){
	        tempEx = new RootExpression(end);
	      }
	      else if(endOP=="^"){
	        tempEx = new PowerExpression(num.pop(),end);
	      }
	      else if(endOP=="cos"){
	        tempEx = new CosExpression(end);
	      }
	      else if(endOP=="tan"){
	        tempEx = new TanExpression(end);
	      }
	      else{
	        tempEx = new SinExpression(end);
	      }
	      end = tempEx;
	    }
	    return end;
	  }
	  

	  public boolean isNumber(String check){
	    boolean ans=true;
	    for(char a:check.toCharArray()){
	      int temp = (int) a;
	      if(!(temp >= 48 && temp <= 57 || temp == 46)){
	        ans = false;
	      }
	    }
	    return ans;
	  }
	  public boolean charNumber(char temp){
	    return (temp >= 48 && temp <= 57 || temp == 46);
	  }
}