class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=0; int right=10_000_000;  

        while(left<right){
            int mid = (left + right + 1) / 2;
            if(feasible(candies, k,mid))
                left=mid;
            else 
                right=mid-1;
        }
        
        return left;
    }
    
    public boolean feasible(int[] nums, long k, int m) {
        long count=0;
        for(int num:nums)
            count+=num/m;
        return count>=k;
    }
}