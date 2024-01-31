package LinkedList.InsertBeginning;
import java.util.*;

class InsertBeginning{
    public class ListNode{
        int data;
        ListNode next;
    public ListNode(int data) {
        this.data  = data;
        this.next = null;
    }
    }
    static ListNode  head = null;
    public void printAll(ListNode node) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void InsertBeginningNode(int data) {
        
        ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;
    }
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ListNode node = new ListNode();
        InsertBeginning ins = new InsertBeginning();
        int n = sc.nextInt();
        while(n != 0) {
            int data = sc.nextInt();
            ins.InsertBeginningNode( data);
            n--;
        }
        ins.printAll(head);
        sc.close();
    }
}