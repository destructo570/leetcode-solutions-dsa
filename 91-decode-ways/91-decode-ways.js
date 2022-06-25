/**
 * @param {string} s
 * @return {number}
 */
var numDecodings = function(s) {
    const dp = [];
    return helper(s,0,dp);
};

function helper(str, idx, dp){
    if(idx===str.length) return 1;
    if(str[idx]==='0') return 0;
    if(dp[idx]>=0) return dp[idx];
    let result = helper(str, idx+1, dp);
    if(idx<str.length-1 && (str[idx]==='1' || str[idx] === '2' && str[idx+1]<'7')){
        result+=helper(str, idx+2, dp);
    }
    return dp[idx]=result;
}
