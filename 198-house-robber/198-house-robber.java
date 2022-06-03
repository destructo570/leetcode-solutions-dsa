class Solution {
    public int rob(int[] nums) {
         int[] memo = new int[nums.length + 1];
         Arrays.fill(memo, -1);
        return helper(nums,nums.length-1,memo);
    }
    
    public int helper(int[] nums, int i, int[] memo) {
        if(i<0) return 0;
        if(memo[i]>=0) return memo[i];
        int result = Math.max(helper(nums,i-2,memo)+nums[i], helper(nums, i-1,memo));
        memo[i] = result;
        return result;
    }
    
//     public int helper(int[] nums, int house) {
//         if(house>nums.length-1) return 0;
        
//         int max = nums[house];
        
//         for(int i=house+2; i<nums.length; i++){
            
//             int result=helper(nums,i);
            
//             if(result>=0 && result>max){
//                 max+=nums[i];
//             }
//         }
        
//         return max;
//     }
}