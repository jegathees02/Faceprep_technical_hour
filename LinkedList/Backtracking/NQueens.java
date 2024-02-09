package LinkedList.Backtracking;

import java.util.*;
public class NQueens {
    public void printQueen(int[][] ar) {
        for(int i=0;i<ar.length;i++) {
            for(int j=0;j<ar.length;j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean isSafe(int[][] ar, int row, int col) {
        for(int i=0;i<col;i++) {
            if(ar[row][i] == 1) return false;
        }
        for(int i=row,j=col;i>=0&&j>=0; i--,j--) {
            if(ar[i][j] == 1) return false;
        }
        for(int i=row,j=col;i<ar.length&&j>=0;i++,j--) {
            if(ar[i][j] == 1) return false;
        }
        return true;
    }

    public boolean nqueenUtil(int[][] ar, int col) {
        // if(row == ar.length) {
        //     col++;
        //     row = 0;
        // }
        if(col == ar.length) {
            printQueen(ar);
            return true;
        }
        boolean res = false;
        for(int i=0;i<ar.length;i++) {
            // ar[i][col] = 1;
            if(isSafe(ar, i, col)) {
                ar[i][col] = 1;
                // if(nqueenUtil(ar, col+1)) return true;
                // if need all the possibilities
                res = nqueenUtil(ar, col+1) || res;
                // if(nqueenUtil(ar, col+1) || res) return true; 
                    ar[i][col] = 0;
            }
        }
        return res;

    }
    // public void nqueen(int[][] ar, int row, int col) {
    //     if(nqueenUtil(ar,col) == false) {
    //         System.out.println("No soln");
    //         return;
    //     }
    //     printQueen(ar);

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[][] ar = new int[n][n];
        NQueens q = new NQueens();
        // q.nqueen(ar, 0, 0);
        if(q.nqueenUtil(ar, 0)== false) {
            System.out.println("no soln");
            return;
        }
        // q.printQueen(ar);

    }
    
}
