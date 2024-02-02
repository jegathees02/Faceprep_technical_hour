package LinkedList.Queue;

import java.util.*;
public class queueUsingStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void enqueue(int data) {
        stack1.push(data);
    }
    public void dequeue() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    public void print() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        while(!stack2.isEmpty()) {
            System.out.print(stack2.peek()+" - ");
            stack1.push(stack2.pop());
        }
        System.out.println();
    }
    public void operations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:");
        System.out.println("1:Enqueue");
        System.out.println("2:Dequeue");
        int inp = sc.nextInt();
        if(inp == 1) {
            System.out.println("Enter value to add");
            int data = sc.nextInt();
            enqueue(data);
            print();
            operations();
        }
        else if(inp == 2)  {
            dequeue();
            print();
            operations();
        }
        else{
            System.out.println("Try Again");
            operations();
        }
        sc.close();
    }
    public static void main(String[] args) {
        queueUsingStacks q = new  queueUsingStacks();
        q.operations();
        // Scanner sc = new Scanner(System.in);
        

        
    }
    
}
