package LinkedList.InsertBeginning;
import java.util.*;

class InsertEnd{
    public class ListNode{
        int data;
        ListNode next;
    public ListNode(int data) {
        this.data  = data;
        this.next = null;
    }
    }
    ListNode  head = null;
    public void printAll() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void InsertEndNode(int data) {
        
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
        }
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ListNode node = new ListNode();
        InsertEnd ins = new InsertEnd();
        int n = sc.nextInt();
        while(n != 0) {
            int data = sc.nextInt();
            ins.InsertEndNode(data);
            n--;
        }
        ins.printAll();
        sc.close();
    }
}