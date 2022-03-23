class Solution {
    public int[] twoSum(int[] nums, int target) {
        return optimal(nums, target);
    }
    
    public int[] optimal(int[] nums, int target){
        //Loop through the array and store it in a hashmap and value should be the index
        //Now loop through the array again and check if (current-target) is in the hashmap
        //if yes return the indices
        HashMap<Integer, Integer> hs = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            hs.put(nums[i], i);
        }
        
        for(int j=0; j<nums.length; j++){
            if(hs.containsKey(target-nums[j]) && hs.get(target-nums[j]) != j){
                res[0]=j;
                res[1]=hs.get(target-nums[j]);
                break;
            }    
        }
        return res;
    }
    
    public int[] naive(int[] nums, int target){
        //Loop through the array and select one element
        //Add this to all elements one by one and check if they equal to target
        //if yes return the indices
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}
