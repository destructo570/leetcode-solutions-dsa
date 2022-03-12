class Solution {
    public int missingNumber(int[] nums) {
        
        int[] hs = new int[nums.length+1];
        
        for(int i=0; i<nums.length; i++){
            hs[nums[i]]++;       
        }
        
        for(int i=0; i<hs.length; i++){
            if(hs[i]==0){
                return i;
            }       
        }
        
        return -1;
        
    }
}