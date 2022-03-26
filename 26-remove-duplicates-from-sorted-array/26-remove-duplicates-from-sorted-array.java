class Solution {
    public int removeDuplicates(int[] nums) {
        
        int ri = 1;
        for(int i=0; i<nums.length; i++)
            if(nums[i]!=nums[ri-1])
                nums[ri++] = nums[i];
        
        return ri;
    }
    
    public int optimalOne(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++)
            hs.add(nums[i]);
        
        int cur = nums[0];
        int ri = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=cur){
                nums[ri++] = nums[i];
                cur = nums[i];
            }
        }
        
        return hs.size();
    }
    
    
    public int naive(int[] nums){
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
           
            for(int j=i+1; j<nums.length; j++){
                
                if(nums[i]==nums[j]){
                    
                    for(int k=j; k<nums.length; k++){
                        if(nums[k]>nums[j]){
                            nums[j]=nums[k];
                            break;
                        }
                    }
                }
            }
            if(nums[i]!=nums[nums.length-1]) count++;
            
        }
        return count+1;
    }
}