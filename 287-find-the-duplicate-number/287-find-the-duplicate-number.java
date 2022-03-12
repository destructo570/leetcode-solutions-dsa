class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] hs = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            hs[nums[i]]++;
        }
        
        for(int i=1; i<hs.length; i++){
            if(hs[i]>1){
                return i;
            }
        }
        
        return -1;
    }
}