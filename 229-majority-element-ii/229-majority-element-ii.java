class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return boydMoore(nums);
    }
    
    public List<Integer> boydMoore(int[] nums) {
        
        int num1=nums[0], num2=nums[0], count1=0, count2=0;
        List<Integer> result = new ArrayList<>();
        for(int num: nums){
            if(num1==num)
                count1++;
            else if(num2==num)
                count2++;
            else if(count1==0){
                num1=num;
                count1++;
            }else if(count2==0){
                num2=num;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        
        int c1=0,c2=0;
        
        for(int num:nums){
            if(num==num1) c1++;
            else if(num==num2) c2++;
        }
        
        if(c1>nums.length/3)result.add(num1);
        if(c2>nums.length/3)result.add(num2);
        return result;
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