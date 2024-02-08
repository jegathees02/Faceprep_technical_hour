package LinkedList.DP;


import java.util.*;
public class differenceWord {
    public int calc(int[][] dp, char[] s1 , char[] s2) {
        if(s1.length == 0) return s2.length;
        if(s2.length == 0) return s1.length;
        for(int i=1;i<=s1.length;i++) {
            for(int j=1;j<=s2.length;j++) {
                if(s1[i-1] == s2[i-1]) dp[i][j] = dp[i-1][j-1];
                else {
                    int min = Math.min(dp[i-1][j],dp[i-1][j-1]);
                    min = Math.min(min,dp[i][j-1]);
                    dp[i][j] = min+1;
                } 
            }
        }
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[s1.length][s2.length];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s1[] = sc.nextLine().toCharArray();
        char s2[] = sc.nextLine().toCharArray();

        int[][] dp = new int[s1.length+1][s2.length+1];
        
        for(int i=0;i<=s1.length;i++) dp[i][0] = i;
        for(int i=0;i<=s2.length;i++) dp[0][i] = i;
        differenceWord dif = new differenceWord();
        System.out.println(dif.calc(dp, s1, s2));
        

    }
    
}
