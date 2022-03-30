class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Store the frequency in a hashmap
        //traverse and return all elements that appear >n/3 time in a array list
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
           if(entry.getValue() > nums.length/3)
               result.add(entry.getKey());
        }
        
        return result;
            
    }
}