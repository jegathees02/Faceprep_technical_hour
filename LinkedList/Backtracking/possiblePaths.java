package LinkedList.Backtracking;

import java.util.*;
public class possiblePaths {
    public int cnt = 0;
    public int paths(int a, int b) {
        if(a == 1 || b ==1) return 1;
        return (paths(a-1,b) + paths(a,b-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        possiblePaths p = new possiblePaths();
        System.out.println(p.paths(m,n));
    }
    
}
