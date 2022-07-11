class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        int[] dp1 = new int[nums.length+1];
        Arrays.fill(dp1, -1);
        int ans1 = helper(nums, 0, dp, false);
        int ans2 = helper(nums, 1, dp1, true);
        return Math.max(ans1, ans2);
    }
    
    public int helper(int[] nums, int idx, int[] dp, boolean takeLast){
        if(idx>=nums.length) return 0;
        if(!takeLast && idx==nums.length-1) return 0;
        if(dp[idx]>=0) return dp[idx];
        int rob=nums[idx]+helper(nums, idx+2, dp, takeLast);
        int dontRob=helper(nums, idx+1, dp, takeLast);
        int result = Math.max(rob, dontRob);
        return dp[idx]=result;
    }
}