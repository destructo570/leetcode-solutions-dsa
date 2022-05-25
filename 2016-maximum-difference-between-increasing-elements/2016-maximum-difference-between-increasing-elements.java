class Solution {
    public int maximumDifference(int[] nums) {
        int lowest = nums[0];
        int maxDiff = -1;
        
        for(int i=1; i<nums.length; i++){
            int profit = nums[i]-lowest;
            if(profit>maxDiff) maxDiff=profit;
            if(nums[i]<lowest) lowest=nums[i];
        }
        
        return maxDiff<=0 ? -1 : maxDiff;
    }
}