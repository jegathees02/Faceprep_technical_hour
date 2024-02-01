package LinkedList.stack;

import java.util.*;
public class postfixToInfix {
    public int prec(Character ch) {
        if(ch == '^') return 3;
        else if(ch == '/' || ch == '*') return 2;
        else if(ch == '+' || ch == '-') return 1;
        else return -1;
    }
    public int op(int a, int b, char ch) {
        if(ch == '+') return b+a;
        else if(ch == '-') return b-a;
        else if(ch == '*') return b*a;
        else if(ch == '/') return b/a;
        else if(ch == '^') return (int)Math.pow(b,a);
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        postfixToInfix pti = new postfixToInfix();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9') {
                stack.push(Integer.valueOf(ch));
            }
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                char op = str.charAt(i);
                int res = pti.op(a,b,op);
                stack.push(res);
                
            }
        }
        sc.close();
        System.out.println(stack.peek());
    }
    
}
