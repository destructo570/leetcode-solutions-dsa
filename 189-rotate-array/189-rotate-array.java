class Solution {
    public void rotate(int[] nums, int k) {
        
    optimalOne(nums, k);
        
    }
    
    public void optimalOne(int[] nums, int j){
        
        int rotations = j%nums.length;
        int[] res = new int[nums.length];
        
        int k=0;
        for(int i=nums.length-rotations; i<nums.length; i++){
            res[k]=nums[i];
            k++;
        }
        for(int i=0; i<nums.length-rotations; i++){
            res[k]=nums[i];
            k++;
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=res[i];
        }
        
    }
    
    
    public void naive(int[] nums, int k){
        for(int i=0; i<k%nums.length; i++)
            rotate(nums);
    }
    
    public void rotate(int[] nums){
        
        int tmp = nums[nums.length-1];
        
        for(int i=nums.length-2; i>=0; i--)
            nums[i+1]=nums[i];        
        
        nums[0]=tmp;
    }
}