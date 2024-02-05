package LinkedList.Graph;

import java.util.*;
public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertex:");
        int v = sc.nextInt();
        System.out.println("Enter the no of edges:");
        int e = sc.nextInt();
        int[][] ar = new int[v][v];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<e;i++) {
            System.out.println("Enter the edges "+(i+1));
            int a = sc.nextInt();
            int b = sc.nextInt();
            ar[a-1][b-1] = 1;
            ar[b-1][a-1] = 1;
        }
        boolean[] visited = new boolean[v];
        List<Integer> q = new ArrayList<>();
        visited[0] = true;
        q.add(0);
        while(!q.isEmpty()) {
            int vertex = q.get(0);
            // visited[vertex] = false;
            list.add(vertex);
            q.remove(0);

            for(int i=0;i<v;i++) {
                if(ar[vertex][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }


        }
        System.out.println(list);
    }
    
}
