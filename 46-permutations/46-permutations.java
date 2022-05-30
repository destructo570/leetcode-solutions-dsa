class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        backTrack(result,nums,new ArrayList<Integer>());
        
        return result;
    }
    
    public void backTrack(List<List<Integer>> result, int[] nums, List<Integer> tmpList) {
        
        if(tmpList.size()==nums.length){
            result.add(new ArrayList<>(tmpList));
            return;
        }else{
            for(int i=0; i<nums.length; i++){
                if(tmpList.contains(nums[i])) continue;
                tmpList.add(nums[i]);
                backTrack(result,nums,tmpList);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }

}