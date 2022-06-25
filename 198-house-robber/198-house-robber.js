/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    const dp = [];
    return helper(nums, 0, dp);
};

function helper(nums, idx, dp){
    if(idx>=nums.length) return 0;
    if(dp[idx]>=0) return dp[idx];
    let rob=nums[idx]+helper(nums, idx+2, dp);
    let dontRob=helper(nums, idx+1, dp);
    return dp[idx] = Math.max(rob, dontRob);
}