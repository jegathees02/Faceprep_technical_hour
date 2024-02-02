package LinkedList.stack;

import java.util.*;
public class infixToPostfix_Jegathees {
    public int prec(char ch) {
        if(ch == '^') return 3;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '-' || ch == '+') return 1;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        infixToPostfix_Jegathees itp = new infixToPostfix_Jegathees();
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >- '0' && ch <= '9')) {
                sb.append(ch);
            }
            else if(ch == '(') {
                stack.push(ch);
            }
            else if(ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                } 
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && 
                (itp.prec(ch) <= itp.prec(stack.peek()))
                ) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }

        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
