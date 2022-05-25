class Solution {
    public int majorityElement(int[] nums) {
        return hashmap(nums);
    }
    
    public int hashmap(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        for(int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
            if(hm.get(num)>nums.length/2) return num;
        }
        return 0;
    }
    
//     public int majorityElement(int[] nums) {
        
//     }
    
//     public int majorityElement(int[] nums) {
        
//     }
}