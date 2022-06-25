/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    const dp = [];
    return helper(n, dp);
};

function helper(n, dp){
    if(n===0) return 1;
    if(n<0) return 0;
    if (dp[n] > 0) return dp[n];
    let result = helper(n-1, dp) + helper(n-2, dp);
        return dp[n]=result;
}