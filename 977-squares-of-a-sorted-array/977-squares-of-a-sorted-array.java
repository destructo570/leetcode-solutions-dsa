class Solution {
    public int[] sortedSquares(int[] nums) {
        int N=nums.length;
        
        int[] result = new int[N];
        int i=0; int j=N-1;
        
        for(int p=j; p>=0; p--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[p]=nums[i]*nums[i];
                i++;
            }else{
                result[p]=nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
    
    public void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp; 
    }
    
    public int[] sortedSquaresTrivial(int[] nums) {
        
        for(int i=0; i<nums.length; i++)
            nums[i]=nums[i]*nums[i];
                
        Arrays.sort(nums);
        return nums;
    }
    
    
    

}