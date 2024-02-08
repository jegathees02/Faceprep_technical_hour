package LinkedList.DP;

import java.util.*;
public class coinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ncoins = sc.nextInt();
        int[] coins = new int[ncoins];
        for(int i=0;i<ncoins;i++) coins[i] = sc.nextInt();
        int amount = sc.nextInt();
        sc.close();
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int coin : coins) {
            for(int j=coin;j<dp.length;j++) {
                if(dp[j-coin] == Integer.MAX_VALUE) continue;
                dp[j] = Math.min(dp[j],(dp[j-coin]+1));
            }
        }
        System.out.println(dp[amount]);
    }
    
}
