class Solution {
    public int majorityElement(int[] nums) {
        return boyd(nums);
    }
    
    public int hashmap(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        for(int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
            if(hm.get(num)>nums.length/2) return num;
        }
        return 0;
    }
    
    public int boyd(int[] nums) {
        int current=nums[0];
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                current=nums[i];
                count=1;
            }else if(nums[i]==current)
                count++;
             else count--;
        }
        return current;
    }
    
}