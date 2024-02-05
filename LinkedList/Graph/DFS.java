package LinkedList.Graph;

import java.util.*;
public class DFS {
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
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];
        stack.push(0);
        visited[0] = true;
        while(!stack.isEmpty()) {
            int node = stack.pop();
            list.add(node);
            for(int i=0;i<v;i++) {
                if(ar[node][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println(list);

    }
    
}
