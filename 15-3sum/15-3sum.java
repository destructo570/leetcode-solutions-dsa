class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return optimal(nums);
    }
    
    public List<List<Integer>> optimal(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                int j=i+1, k=nums.length-1, sum=0-nums[i];
            
                while(j<k){
                    if(nums[j]+nums[k]==sum){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j<k && nums[j] == nums[j+1]) j++;
                        while(j<k && nums[k] == nums[k-1]) k--;
                        j++; k--;
                    }else if(nums[j]+nums[k]>sum) k--;
                     else j++;
                }
            }
            
        }
        
        return result;
    }
    
    public List<List<Integer>> twoPointer(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int j=i+1, k=nums.length-1;    
            List<Integer> list = new ArrayList<>();
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum>0) k--;
                else j++;
            }
        }
        
        return new ArrayList<>(result);
    }
}