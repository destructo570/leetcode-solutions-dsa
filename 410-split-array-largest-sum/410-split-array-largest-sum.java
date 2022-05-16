class Solution {
    public int splitArray(int[] nums, int m) {
        int left=max(nums); int right=maxSum(nums);
        
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(checkThreshHold(nums,m,mid))
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }
    
    public static boolean checkThreshHold(int[] nums, int m,int threshold){
        int count=1;
        int total=0;
        for(int num:nums){
            total+=num;
            if(total>threshold){
                count++;
                total=num;
                if(count>m) return false;
            }
        }
        return true;
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
}