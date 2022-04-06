class Solution {
    public int findMiddleIndex(int[] nums) {
        return optimalOne(nums);
    }
    
    public int optimalOne(int[] nums) {
        
        int[] prefixSum = new int[nums.length+1];

        for(int i=1; i<=nums.length; i++)
            prefixSum[i] = nums[i-1] + prefixSum[i-1];

        for(int i=0; i<nums.length; i++)
            if(prefixSum[i]==(prefixSum[nums.length]-prefixSum[i+1])) return i;
        
        return -1;
    }
    
    public int bruteForce(int[] nums) {
        
        //Loop through the array and select an index
        //calculate the sum of all elements to the left of the index and store it in leftSum
        //calculate the sum of all elements to the right of the index and store it in rightSum
        //if leftSum == rightSum return the index
        
        
        for(int i=0; i<nums.length; i++){
            int leftSum=0;
            int rightSum=0;    
            
            for(int j=i-1; j>=0; j--)
                leftSum+=nums[j];
            
            
            for(int k=i+1; k<nums.length; k++)
                rightSum+=nums[k];
            
            
            if(leftSum==rightSum) return i;
            
        }
        
        return -1;
    }
}