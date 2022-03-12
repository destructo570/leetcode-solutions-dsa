class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=0;
        int actualSum=0;
        
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        
        for(int i=0; i<=nums.length; i++){
            actualSum+=i;
        }
        
        return actualSum-sum;
    
    }
        
    
        
/*    public int missingNumberHashing(int[] nums) {
        
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
*/
}

