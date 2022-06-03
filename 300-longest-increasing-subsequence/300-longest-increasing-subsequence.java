class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] memo=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return maxLength(nums,0,-1,memo);
    }
    
    public int maxLength(int[] nums, int i, int prev,int[] memo) {
        if(i>=nums.length) return 0;
        if(memo[prev+1] != -1) return memo[prev+1];
        int take=0, dont = maxLength(nums,i+1, prev, memo);
        
        if(prev==-1 || nums[i]>nums[prev]){
            take=1+maxLength(nums,i+1,i, memo);
        }
        return memo[prev+1] = Math.max(take,dont);
    }
}