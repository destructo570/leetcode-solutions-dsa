class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] result = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int num:nums)
            ++result[num];
        
        for(int i=0; i<result.length; i++)
            if(result[i]>1) res.add(i);
        
        return res;
    }
}