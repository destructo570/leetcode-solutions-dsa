class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left=1, right=1_000_000_000;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(feasible(nums, maxOperations,mid)){
                right=mid;
            }else left=mid+1;
        }
        
        return left;
    }
    
    public boolean feasible(int[] nums, int maxOperations, int k) {
        int count=0;
        
        for(int num:nums){
            count+=(num - 1) / k;
        }
        
        return count<=maxOperations;
    }
    
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr)
            max=Math.max(max,num);
        return max;
    }
    
    public int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int num:arr)
            min=Math.min(min,num);
        return min;
    }
}