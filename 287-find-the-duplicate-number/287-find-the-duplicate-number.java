class Solution {
    public int findDuplicate(int[] nums) {
        int lo=1; int hi=nums.length-1;
        
        while(lo<hi){
            int count=0;
            int mid=(lo+hi)/2;
            for(int num: nums){
                if(num<=mid)count++;
            }
            
            if(count>mid) hi=mid;
            else lo=mid+1;
        }
        
        return lo;
        
    }
    
/*    public int findDuplicateHashing(int[] nums) {
        
        int[] hs = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            hs[nums[i]]++;
        }
        
        for(int i=1; i<hs.length; i++){
            if(hs[i]>1){
                return i;
            }
        }
        
        return -1;
    }
*/
}