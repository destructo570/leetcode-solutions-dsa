class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left=max(weights); 
        int right=Integer.MAX_VALUE;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(isValidWeight(weights,days,mid))
                right=mid;
            else 
                left=mid+1;
        }
        
        return left;
        
    }
    
    public boolean isValidWeight(int[] weights, int days, int capacity){
        int count=1;
        int total=0;
        for(int weight:weights){
            total+=weight;
            if(total>capacity){
                count++;
                total=weight;
                if(count>days) return false;
            }
        }
        return true;
    }
    
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr)
            max=Math.max(max,num);
        return max;
    }
}