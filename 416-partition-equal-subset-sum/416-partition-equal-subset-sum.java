class Solution {
    public boolean canPartition(int[] nums) {
        HashMap<Double, Boolean> hm = new HashMap<>();

        int sum = 0;
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
        }
        return targetSum(nums, 0, sum, sum, hm);
    }
    
        public static boolean targetSum(int[] arr, int idx, double curr, double sum, HashMap<Double, Boolean> hm){
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