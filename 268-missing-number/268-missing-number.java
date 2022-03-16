class Solution {
    public int missingNumber(int[] nums) {
        
    int xor = 0, i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}

	return xor ^ i;
    
    }
    
/*    
    public int missingNumberSimpleSum(int[] nums) {
        
        int sum=0;
        int actualSum=0;
        
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            actualSum+=i+1;
        }
        
        return actualSum-sum;
    
    }
*/
        
    
        
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

