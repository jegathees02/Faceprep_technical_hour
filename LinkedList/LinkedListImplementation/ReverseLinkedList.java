package LinkedList.LinkedListImplementation;
import java.util.Scanner;

public class ReverseLinkedList {
    public class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertNode(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        
    }
    public void reverse() {
        Node prev = null,next = null;
        Node current = head;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        // print(prev);
    }
    public void print() {
        Node temp = head;
        while(temp != null) {
            if(temp.next == null) {
                System.out.print(temp.data);
                break;
            }
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the linked list");
        ReverseLinkedList list = new ReverseLinkedList();
        for(int i=0;i<n;i++) {
            list.insertNode(sc.nextInt());
        }
        sc.close();
        list.print();
        list.reverse();
        list.print();

        
    }
    
}
