class Solution {
    public int maxSubArray(int[] nums) {
        // return brute(nums);
        return better(nums);
    }
    
    public int brute(int[] nums){
        int max=Integer.MIN_VALUE;
    
        
        for(int i=0; i<nums.length; i++){
            int sum=0;
            
            for(int j=i; j<nums.length; j++){
                sum = sum+nums[j];
                
                if(sum>max){
                    max = sum;
                }
            }
        }
        
        return max;
    }
    
    public int better(int[] nums){
        int Max=nums[0];
        int MaxCur=nums[0];
        
        for(int i=1; i<nums.length; i++){
            
            MaxCur = Math.max(nums[i], nums[i]+MaxCur);    
            
            if(MaxCur>Max){
                Max=MaxCur;
                
            }
        }
        
        return Max;
    }
    
    public int optimal(int[] nums){
        return 0;
    }
}