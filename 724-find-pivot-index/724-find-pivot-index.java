class Solution {
    public int pivotIndex(int[] nums) {
        
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