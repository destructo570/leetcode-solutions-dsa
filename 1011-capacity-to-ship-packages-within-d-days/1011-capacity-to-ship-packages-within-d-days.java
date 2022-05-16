class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left=1; int right=Integer.MAX_VALUE;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(isValidWeight(weights,days,mid))
                right=mid;
            else 
                left=mid+1;
        }
        
        return left;
        
    }
    
    public boolean isValidWeight(int[] arr, int days, int weight){
        int count=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
             if(arr[i]>weight) return false;
            if(sum==weight){
                count++;
                sum=0;
            }else if(sum>weight){
                count++;
                sum=arr[i];
            }
        }
        if(sum>0) count++;
        return count<=days;
    }
}