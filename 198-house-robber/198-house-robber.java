class Solution {
    
    public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int prev1 = 0;
    int prev2 = 0;
    for (int num : nums) {
        int tmp = prev1;
        prev1 = Math.max(prev2 + num, prev1);
        prev2 = tmp;
    }
    return prev1;
}
//     public int rob(int[] nums) {
//          int[] memo = new int[nums.length + 1];
//          Arrays.fill(memo, -1);
//         return helper(nums,nums.length-1,memo);
//     }
    
//     public int helper(int[] nums, int i, int[] memo) {
//         if(i<0) return 0;
//         if(memo[i]>=0) return memo[i];
//         int result = Math.max(helper(nums,i-2,memo)+nums[i], helper(nums, i-1,memo));
//         memo[i] = result;
//         return result;
//     }

}