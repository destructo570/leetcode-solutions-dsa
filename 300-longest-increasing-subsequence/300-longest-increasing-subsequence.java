class Solution {
    
    public int lengthOfLIS(int[] nums) {
    if(nums==null || nums.length==0){
        return 0;
    }
    int[] dp = new int[nums.length];
    int max = 1;
    for(int index=0; index<nums.length;index++){
        dp[index]=1;
        for(int dpIndex=0; dpIndex<index; dpIndex++){
            if(nums[dpIndex]<nums[index]){
                dp[index]=Math.max(dp[index],dp[dpIndex]+1);
                max=Math.max(dp[index],max);
            }
        }
    }
    return max;
}
//     public int lengthOfLIS(int[] nums) {
//         int[] memo=new int[nums.length+1];
//         Arrays.fill(memo,-1);
//         return maxLength(nums,0,-1,memo);
//     }
    
//     public int maxLength(int[] nums, int i, int prev,int[] memo) {
//         if(i>=nums.length) return 0;
//         if(memo[prev+1] != -1) return memo[prev+1];
//         int take=0, dont = maxLength(nums,i+1, prev, memo);
        
//         if(prev==-1 || nums[i]>nums[prev]){
//             take=1+maxLength(nums,i+1,i, memo);
//         }
//         return memo[prev+1] = Math.max(take,dont);
//     }
}