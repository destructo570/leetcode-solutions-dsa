class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] result = new int[nums.length];
        boolean flag=false;
        int productSoFar=1;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                flag=true;
                count++;
            }else {
                productSoFar*=nums[i];
            }
        }
        if(count>1) return result;
        
        for(int i=0; i<pre.length; i++){
            
            if(nums[i]!=0){
                if(flag){
                    result[i]=0;
                }else result[i]=productSoFar/nums[i];
                
            }else{
                result[i]=productSoFar/1;
            };
            
        }
        
        return result;
    }
}