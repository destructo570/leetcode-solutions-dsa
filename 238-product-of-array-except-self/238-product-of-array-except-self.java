class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int productSoFar=1;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)  count++;
            else productSoFar*=nums[i];
        }
        if(count>1) return result;
        
        for(int i=0; i<result.length; i++){
            if(nums[i]!=0){
                if(count>0){
                    result[i]=0;
                }else result[i]=productSoFar/nums[i];
                
            }else result[i]=productSoFar;
        }
        
        return result;
    }
}