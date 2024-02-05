package LinkedList.Graph;

import java.util.*;
public class listRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Vertex");
        int v = sc.nextInt();
        System.out.println("Enter no of edges");
        int e = sc.nextInt();
        List<List<Integer>> outer = new ArrayList<List<Integer>>(v);
        for(int i=0;i<v;i++) {
            outer.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++) {
            System.out.println("Enter the edges "+(i+1));
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            outer.get(a-1).add(b-1);
            outer.get(b-1).add(a-1);
        }
        for(int i=0;i<v;i++) {
            System.out.print(i+" => ");
            for(int j=0;j<outer.get(i).size();j++) {
                System.out.print(outer.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
