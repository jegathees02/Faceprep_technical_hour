package LinkedList.stack;

import java.util.*;

public class arrayImplementation {
    public int ptr = 0;
    public void print( int[] ar) {
        for(int i=(ptr-1);i>=0;i--) {
            System.out.print(ar[i]+"-");
        }
    }
    public void push(int data, int[] ar) {
        if(ptr == ar.length) {
            System.out.println("Overflow");
        }
        else{
            ar[ptr] = data;
            ptr++;
            System.out.println("Stack after push:");
            print(ar);
        }

    }
    public void pop( int[] ar) {
        if(ptr-1 == 0) {
            System.out.println("Array is Empty");
        }
        else{
            ar[ptr-1] = 0;
            ptr--;
            System.out.println("Stack After pop:");
            print( ar);
        }
    }
    public void peek( int[] ar) {
        if(ptr-1 == 0) {
            System.out.println("Array is Empty");
            operations(ar);
        }
        else{
            System.out.println("Peek Element  is : "+ar[ptr-1]);
        }
    }
    public void operations(int[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the following Operations:");
        System.out.println("1:Push");
        System.out.println("2:pop");
        System.out.println("3.Peek");
        int opt = sc.nextInt();
        if(opt == 1) {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            push(data,ar);
            operations(ar);
        } 
        else if(opt == 2) {
            pop( ar);
            operations(ar);
        }
        else if(opt == 3) {
            peek(ar);
            operations(ar);
        }
        else{
            System.out.println("Invalid. Try Again");
            operations(ar);
        }
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        arrayImplementation ari = new arrayImplementation();
        ari.operations(ar);
        sc.close();
        // int ptr = 0;
        // for(int i=0;i<n;i++) {
        //     ar[i] = sc.nextInt();
        // }
       
    }
}
