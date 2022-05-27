class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return twoPointer(nums);
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