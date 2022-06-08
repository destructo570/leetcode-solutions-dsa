class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return helper(m,n,dp);
    }
    
    public int helper(int m, int n, int[][] dp) {
        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        
        int result = helper(m-1,n,dp)+helper(m,n-1,dp);
        return dp[m][n]=result;
    }
}