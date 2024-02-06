package LinkedList.ShortestPath;

import java.util.*;
class dijkstraAlgrorithm{
    public int minDistance(int dis[], boolean[] visited) {
        int min = Integer.MAX_VALUE, min_idx = -1;
        for(int i=0;i<dis.length;i++) {
            if(visited[i] == false && dis[i] <= min) {
                min = dis[i];
                min_idx = i;
            }
        }
        return min_idx;
    }
    public void dijkstra(int[][] ar, int start) {
        int[] dis = new int[ar.length];

        boolean[] visited = new boolean[ar.length];
        Arrays.fill(dis,Integer.MAX_VALUE);

        dis[start] = 0;

        for(int i=0;i<ar.length-1;i++) {
            int u = minDistance(dis, visited);
            visited[u] = true;
            for(int j=0;j<ar.length;j++) {
                if(!visited[j] && ar[u][j] != 0 && dis[u] != Integer.MAX_VALUE && dis[u]+ar[u][j] < dis[j]) {
                    dis[j] = dis[u]+ar[u][j];
                }
            }
        }

        for(int  i=0;i<dis.length;i++) {
            System.out.print(dis[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of nodes:");
        int v = sc.nextInt();
        System.out.println("Enter the  no of edges");
        int e = sc.nextInt();
        int[][] ar = new int[v][v];
        for(int i=0;i<e;i++) {
            System.out.println("Enter the  edges "+(i+1));
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            ar[a][b] = c;
            ar[b][a] = c;

        }
        dijkstraAlgrorithm d = new dijkstraAlgrorithm();
        d.dijkstra(ar, 0);

    }
}