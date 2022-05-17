class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1; int right=max(nums);
        
        while(left<right){
            int mid=left+(right-left)/2;
            
            if(feasible(nums, mid, threshold)) right=mid;
            else left=mid+1;
        }
        
        return left;
    }
    
    public boolean feasible(int[] arr, int divisor, int threshold){
        return maxSum(arr,divisor) <= threshold;
    }
    
    public int maxSum(int[] arr, int divisor){
        int sum=0;
        for(double num:arr)
            sum+=Math.ceil(num/divisor);
        return sum;
    }
    
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr)
            max=Math.max(max,num);
        return max;
    }
}