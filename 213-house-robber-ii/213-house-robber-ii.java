class Solution {    
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;        
        int exclude_1st = rob_helper(nums, 1, nums.length-1);
        int include_1st = nums[0] + rob_helper(nums, 2, nums.length-2);
        return Math.max(include_1st, exclude_1st);        
    }

    public int rob_helper(int[] nums, int start, int end) {     
        int pre_i_2 = 0;
        int pre_i_1 = 0;
        for(int i=start; i<=end; i++)
        {
            int cur = Math.max(nums[i] + pre_i_2, pre_i_1);
            int temp = pre_i_1;
            pre_i_1 = cur;
            pre_i_2 = temp;
        }        
        return pre_i_1;
    }
    
    public int recursive(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int[] dp1 = new int[nums.length];
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