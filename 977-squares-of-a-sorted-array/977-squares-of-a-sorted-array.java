class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int ptr=nums.length-1;
        int i=0, j=nums.length-1;
        while(ptr>=0){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(a>b) {
                result[ptr--]=a;
                i++;
            }else{
                result[ptr--]=b;
                j--;
            }
        }
        return result;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}