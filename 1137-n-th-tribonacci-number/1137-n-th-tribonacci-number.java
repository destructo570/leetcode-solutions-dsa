class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        return helper(n, dp);
    }
    
    public int helper(int n, int[] dp) {
        if(n==0 || n==1) return n;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int result = helper(n-1, dp)+helper(n-2, dp)+helper(n-3, dp);
        return dp[n]=result;
    }
}