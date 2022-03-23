class Solution {
    public void moveZeroes(int[] nums) {
        
        //Use two pointers i and j
        //traverse the array and if at ith index value is > 0 swap with j and increment j
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int tmp = nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                j++;
            }
        }
        
    }
}