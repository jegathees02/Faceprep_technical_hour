package LinkedList.InsertBeginning;

import java.util.*;
public class insertPosition {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public Node() {
            //TODO Auto-generated constructor stub
        }
    }
    Node node = new  Node();
    Node head = null;

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPos(int pos,int data) {
        Node temp = head;
        int cnt = 0;
        while(temp.next != null) {
            cnt++;
            if(cnt == pos) break;
        }
        Node dummy = temp.next;
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.next = dummy;
    }

    public void printAll(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        insertPosition ins = new insertPosition();
        int n = sc.nextInt();
        while(n != 0) {
            int data = sc.nextInt();
            ins.insertEnd(data);
            n--;
        }
        int pos = sc.nextInt();
        int key = sc.nextInt();
        ins.insertAtPos(pos, key);
        ins.printAll();
        sc.close();

    }
}
