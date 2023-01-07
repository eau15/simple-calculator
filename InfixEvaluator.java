
import java.util.Stack;

public class InfixEvaluator {
  public int evaluate(String expression) {
    Stack<Integer> numbers = new Stack<>();
    Stack<Character> operations = new Stack<>();
    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);
      if (Character.isDigit(c)) {
        int num = 0;
        while (Character.isDigit(c)) {
          num = num * 10 + c - 48;
          i++;
          if (i < expression.length()) {
            c = expression.charAt(i);
            continue;
          } 
          break;
        } 
        i--;
        numbers.push(Integer.valueOf(num));
      } else if (c == '(') {
        operations.push(Character.valueOf(c));
      } else if (c == ')') {
        while (((Character)operations.peek()).charValue() != '(') {
          int output = performOperation(numbers, operations);
          numbers.push(Integer.valueOf(output));
        } 
        operations.pop();
      } else if (isOperator(c)) {
        while (!operations.isEmpty() && precedence(c) <= precedence(((Character)operations.peek()).charValue())) {
          int output = performOperation(numbers, operations);
          numbers.push(Integer.valueOf(output));
        } 
        operations.push(Character.valueOf(c));
      } 
    } 
    while (!operations.isEmpty()) {
      int output = performOperation(numbers, operations);
      numbers.push(Integer.valueOf(output));
    } 
    return ((Integer)numbers.pop()).intValue();
  }
  
  static int precedence(char c) {
    switch (c) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
    } 
    return -1;
  }
  
  public int performOperation(Stack<Integer> numbers, Stack<Character> operations) {
    int a = ((Integer)numbers.pop()).intValue();
    int b = ((Integer)numbers.pop()).intValue();
    char operation = ((Character)operations.pop()).charValue();
    switch (operation) {
      case '+':
        return a + b;
      case '-':
        return b - a;
      case '*':
        return a * b;
      case '/':
        if (a == 0)
          throw new UnsupportedOperationException("Cannot divide by zero"); 
        return b / a;
      case '^':
        if (a == 0 && b == 0)
          throw new UnsupportedOperationException("Cannot raise zero to an exponent of zero"); 
        return (int)Math.pow(b, a);
    } 
    return 0;
  }
  
  public boolean isOperator(char c) {
    return !(c != '+' && c != '-' && c != '/' && c != '*' && c != '^');
  }
  
  public static void main(String[] args) {}
}
