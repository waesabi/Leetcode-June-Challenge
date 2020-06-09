package com.company;

public class CoinChange2 {

    /*
        Accepted
        DP Problem 
     */
    public int change(int amount, int[] coins) {
        int rows = coins.length;
        int cols = amount;
        int[][] dp = new int[rows + 1][cols + 1];
        for(int i = 0; i <= rows; i++) {
            dp[i][0] = 1;
        }
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                int coin = coins[i - 1];
                dp[i][j] = dp[i - 1][j];
                if(coin <= j) {
                    dp[i][j] += dp[i][j - coin];
                }
            }
        }
        return dp[rows][cols];
    }
}
