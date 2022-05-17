class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0, right = 10_000_000;

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
    
    public int maxSum(int[] arr){
        int sum=0;
        for(int num:arr)
            sum+=num;
        return sum;
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