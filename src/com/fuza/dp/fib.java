package com.fuza.dp;

public class fib {
    public int fib1(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i<=n;i++){
            dp[i] = dp[i-1]+dp[i+2];
            dp[i]%=1000000007;
        }
        return dp[n];
    }
}