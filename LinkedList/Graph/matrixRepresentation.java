package LinkedList.Graph;


import java.util.*;
class matrixRepresentation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertex:");
        int v = sc.nextInt();
        System.out.println("Enter the no of edges:");
        int e = sc.nextInt();
        int[][] ar = new int[v][v];
        for(int i=0;i<e;i++) {
            System.out.println("Enter the edges "+(i+1));
            int a = sc.nextInt();
            int b = sc.nextInt();
            ar[a-1][b-1] = 1;
            ar[b-1][a-1] = 1;
        }
        for(int i=0;i<v;i++) {
            for(int j=0;j<v;j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();

        }
    }
}