class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left=1, right=1_000_000_000;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(feasible(nums, maxOperations,mid))
                right=mid;
            else 
                left=mid+1;
        }
        
        return left;
    }
    
    public boolean feasible(int[] nums, int maxOperations, int k) {
        int count=0;
        for(int num:nums)
            count+=(num - 1) / k;
        return count<=maxOperations;
    }
}