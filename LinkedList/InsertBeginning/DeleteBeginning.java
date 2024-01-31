package LinkedList.InsertBeginning;
import java.util.*;


public class DeleteBeginning {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    public void printAll() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insert(int data) {
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

    public  void deleteBeginning() {
        if(head == null) return ;
        head = head.next;
        
    }
    public void deleteEnd() {
        if(head == null) return;
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    public void deletePos(int pos) {
        Node temp = head;
        int cnt = 1;
        while (temp.next.next != null) {
            if(cnt == pos){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
            cnt++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        DeleteBeginning db = new DeleteBeginning();
        int n = sc.nextInt();
        while(n != 0) {
            int data = sc.nextInt();
            db.insert(data);
            n--;
        }
        int pos = sc.nextInt();
        // int val = sc.nextInt();
        // db.printAll();
        db.printAll();
        db.deletePos(pos);
        db.printAll();
        db.deleteBeginning();
        db.printAll();
        db.deleteEnd();
        db.printAll();
        sc.close();

    }
}
