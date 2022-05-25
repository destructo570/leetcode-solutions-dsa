class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return hashmap(nums);
    }
    
    public List<Integer> hashmap(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        List<Integer> result = new ArrayList<>();
        for(int num:nums)
            hm.put(num, hm.getOrDefault(num,0)+1);
        
        for(Map.Entry<Integer, Integer> entry:hm.entrySet())
            if(entry.getValue()>nums.length/3) result.add(entry.getKey());
        
        return result;
    }
}