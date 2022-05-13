class Solution {
    public int findDuplicate(int[] arr) {
        
        HashSet<Integer> hs = new HashSet<>();
		
		for(int num:arr){
			if(hs.contains(num))
				return num;
			else hs.add(num);
		}
        
        return -1;
    }
}