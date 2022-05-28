class Solution {
    public int findDuplicate(int[] nums) {
        
        return usingHashing(nums);
    }
    
    public int optimal(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        
        for(int i=0; i<nums.length; i++)
            if(hm.containsKey(nums[i]) && hm.get(nums[i])>1) return nums[i];
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