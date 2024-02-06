package LinkedList.ShortestPath;


import java.util.*;
public class bellmanFordAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes:");
        int v = sc.nextInt();
        System.out.println("Enter no of edges:");
        int e = sc.nextInt();
        int[][] ar = new int[v][v];
        for(int i=0;i<e;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            ar[a][b] = c;
        }
    }
    
}
