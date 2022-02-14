class Solution {
    public int subarraySum(int[] nums, int k) {
        
       return naive(nums, k);
    }
    
    public int optimal(int[] nums, int k){
        int count=0;
        int curSum=0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            curSum=curSum+nums[i];
            
            if(curSum==k){
                count++;
            }
            
            if(hs.containsKey(curSum-k)){
                count++;
            }
            
            hs.put(curSum, i);
        }
        
        return count;
    }
    
    public int naive(int[] nums, int k){
        int count=0;
        for(int i=0; i<nums.length; i++){
            long sum=0;
            for(int j=i; j<nums.length; j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        
        return count;
    }
}