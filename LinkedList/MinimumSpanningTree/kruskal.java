    package LinkedList.MinimumSpanningTree;

    import java.util.*;
    public class kruskal {
        static int v;
        static int[] parent;
        public static int find(int i){
            while(parent[i] != i) {
                i = parent[i];
            }
            return i;

        }
        public static void union(int  i, int j) {
            int a = find(i);
            int b = find(j);
            parent[a] = b;
        }
        public static void krusk(int[][] ar) {
            int mincost = 0;
            
            for(int i=0;i<parent.length;i++) parent[i] = i;

            int edge_cnt = 0;
            while(edge_cnt < ar.length-1) {
                int min = Integer.MAX_VALUE;
                int a = -1, b = -1;
                for(int i=0;i<ar.length;i++) {
                    for(int j=0;j<ar.length;j++) {
                        if(find(i) != find(j) &&  ar[i][j] < min) {
                            min = ar[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
                edge_cnt++;
                union(a,b);
                System.out.println("Edge Count : "+edge_cnt+" : "+a+" => "+b+" min: "+min);
                mincost += min;
            }
            System.out.println("Min cost "+mincost);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of vertex");
            v = sc.nextInt();
            parent = new int[v];
            System.out.println("Enter no of Edges");
            int e = sc.nextInt();
            int[][] ar = new int[v][v];
            for(int i=0;i<e;i++) {
                System.out.println("Enter edge "+(i+1));
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                ar[a][b] = c;
                ar[b][a] = c;
            }
            krusk(ar);
        }

    }
