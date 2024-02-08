package LinkedList.ShortestPath;


import java.util.*;
public class bellmanFordAlgo {
    static class Edge{
        int source , destination, weight;
        Edge() {
            source = destination = weight = 0;
        }
    }
    public static void bellmanFord(Edge[] edges, int v, int e, int source) {
        int[] distance = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes:");
        int v = sc.nextInt();
        System.out.println("Enter no of edges:");
        int e = sc.nextInt();
        
    }
    
}
