class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=1, num=nums[0];
        
        for(int i=ptr; i<nums.length; i++){
            if(nums[i]!=num) {
                num=nums[i];
                swap(nums, ptr++, i);
                
            }
        }
        
        return ptr;
    }
    
    private void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}