class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[ptr]) 
                nums[++ptr]=nums[i];
        }
        
        return ++ptr;
    }
    
    private void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}