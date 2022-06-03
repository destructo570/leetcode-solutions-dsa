class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        int len=nums.length;
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<len; i++){
            max=Math.max(max, product*=nums[i]);
            if(nums[i]==0) product=1;
        }
        
        product=1;
        for(int i=len-1; i>=0; i--){
            max=Math.max(max, product*=nums[i]);
            if(nums[i]==0) product=1;
        }
        
        return max;
    } 

}