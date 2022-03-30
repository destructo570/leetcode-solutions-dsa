class Solution {
    public int majorityElement(int[] nums) {

        return usingBoyerMoore(nums);
    }
    
    public int usingBoyerMoore(int[] nums) {

        int count = 0;
        int current = -1;
        
        for(int i=0; i<nums.length; i++){
            if(count==0){
                current=nums[i];
                count++;
            }else if(nums[i]==current){
                count++;
            }else {
                count--;
            }
        }
        
        return current;
    }
    
        public int usingHashing(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        
        for(HashMap.Entry<Integer, Integer> entry: hm.entrySet())
            if(entry.getValue()>nums.length/2)
                return entry.getKey();
        
        return -1;
    }
    
    
}