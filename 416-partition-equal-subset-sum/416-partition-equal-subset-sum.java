class Solution {
    public boolean canPartition(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        
        int sum = 0;
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
        }
        if(sum%2 != 0) return false;
        int[] dp = new int[sum+1];
        Arrays.fill(dp, -1);
        //return targetSum(nums, 0, sum, sum, hm);
        return targetSum2(nums, 0, sum, sum, dp);
    }
    
    public static boolean targetSum2(int[] arr, int idx, int curr, int sum, int[] dp){
        if(curr == sum/2) return true;
        if(idx>= arr.length || curr<0) return false;
        if(dp[curr] != -1) return dp[curr] == 1? true :false;
        boolean take = targetSum2(arr, idx+1, curr-arr[idx], sum, dp);
        boolean donttake = targetSum2(arr, idx+1, curr, sum, dp);

        boolean result = take || donttake;
        dp[curr] = result ? 1 : 0;
        return result;
    }
    
   public static boolean targetSum(int[] arr, int idx, int curr, int sum, HashMap<Integer, Boolean> hm){
        if(curr == sum/2) return true;
        if(idx>= arr.length || curr<0) return false;
        if(hm.containsKey(curr)) return hm.get(curr);
        boolean take = targetSum(arr, idx+1, curr-arr[idx], sum, hm);
        boolean donttake = targetSum(arr, idx+1, curr, sum, hm);

        boolean result = take || donttake;
        hm.put(curr, result);
        return result;
    }
}