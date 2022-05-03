class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = Arrays.copyOfRange(nums, 0, nums.length);;
        Arrays.sort(arr);
        int count=0;
        int a=0;
        int b=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=nums[i] &&count==0){
                a=i;
                count++;
            }else if(arr[i]!=nums[i] && count>0){
                b=i+1;
            }
        }
        
        return b-a;
    }
}