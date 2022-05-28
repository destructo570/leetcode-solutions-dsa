class Solution {
    public int findDuplicate(int[] nums) {
        
        return marking(nums);
    }
    
    public int marking(int[] nums) {
        for(int num:nums){
            int idx=Math.abs(num);
            if(nums[idx]<0) return idx;
            nums[idx]=-nums[idx];
        }
       
        return 0;
    }
    
    public int usingHashing(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i])) return nums[i];
            hs.add(nums[i]);
        }
        return 0;
    }
}