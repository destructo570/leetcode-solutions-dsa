class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        return usingBoyerMoore(nums);
            
    }
    
    public List<Integer> usingBoyerMoore(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        if(nums.length == 0)
            return result;
        
        int num1=nums[0];int num2=nums[0]; int count1=0; int count2=0;
        
        
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
            }
            else{
                count1--;
                count2--;
            }
        }
        
        int c1=0; int c2=0;
        
        for(int num:nums){
            if(num==num1){
                c1++;
            }else if(num==num2){
                c2++;
            }
        }
        
        if(c1>nums.length/3) result.add(num1);
        if(c2>nums.length/3) result.add(num2);
        return result;
            
    }
    
    public List<Integer> usingHashing(int[] nums) {
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