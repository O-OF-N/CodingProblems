package com.dcp163;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Dcp163 {

  private Stack<Integer> numbers;
  private Queue<String> symbols;
  private int i;


  int evalRPN(String[] tokens) {
    numbers = new Stack<>();
    symbols = new LinkedList<>();
    i=0;
    while(i<tokens.length) {
      add(tokens);
      evaluate();
    }
    return numbers.pop();
  }

  private void add(String[] tokens) {
    if(i>=tokens.length) return;
    String token = tokens[i];
    try{
      Integer t = Integer.parseInt(token);
      if(!symbols.isEmpty()) return;
      numbers.add(t);
    }catch(Exception e){
      symbols.add(token);
    }
    i++;
    add(tokens);
  }

  private void evaluate() {
    while(!symbols.isEmpty()) {
      Integer n1 = numbers.pop();
      Integer n2 = numbers.pop();
      String symbol = symbols.poll();
      numbers.add(execute(n2,n1,symbol));
    }
  }

  private int execute(int a, int b, String symbol) {
    switch(symbol) {
      case "+":
        return a+b;
      case "-":
        return a-b;
      case "*":
        return a*b;
      case "/":
        return a/b;
      default:
        return 0;
    }
  }
}
