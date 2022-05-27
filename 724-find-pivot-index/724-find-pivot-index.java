class Solution {
    public int pivotIndex(int[] nums) {
        return pivotIndexW(nums);
    }
    
    public int pivotIndexW(int[] nums) {
        for(int i=1; i<nums.length; i++)
            nums[i]=nums[i]+nums[i-1];
        
        for(int i=0; i<nums.length; i++){
            if(i==0 && (nums[nums.length-1]-nums[i])==0) return i;
            if(i-1>=0 && nums[i-1]==(nums[nums.length-1] - nums[i])) return i;
        }
        return -1;
    }
    
    public int optimal(int[] nums) {
        
        int[] prefixSum = new int[nums.length+1];
        for(int i=1; i<=nums.length; i++)
            prefixSum[i] = nums[i-1] + prefixSum[i-1];
        
        System.out.println(Arrays.toString(prefixSum));
        for(int i=0; i<nums.length; i++){
            int leftSum = prefixSum[i];
            int rightSum = prefixSum[nums.length]-prefixSum[i+1];

            if(leftSum==rightSum) return i;
        }
        return -1;
    }
}