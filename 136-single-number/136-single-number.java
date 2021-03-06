class Solution {
    public int singleNumber(int[] nums) {
        int tmp=0;
        
        for(int i=0; i<nums.length; i++)
            tmp^=nums[i];
        
        return tmp;
    }   
    
    
    public int singleNumberHashing(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        
        for(int i=0; i<nums.length; i++)
            if(hm.get(nums[i]) == 1) return nums[i];
        
        return 0;
    } 
}