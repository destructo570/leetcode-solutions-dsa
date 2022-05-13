class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] result = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int num:nums)
            ++result[num];
        
        for(int i=1; i<result.length; i++)
            if(result[i]==0) res.add(i);
        
        return res;
    }
}