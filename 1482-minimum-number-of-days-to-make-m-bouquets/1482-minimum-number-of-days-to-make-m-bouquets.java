class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (m * k))
            return -1;
        int left=1, right=max(bloomDay);
        
        while(left<right){
            int mid=left+(right-left)/2;
            
            if(feasible(bloomDay, m, k, mid))
                right=mid;
            else left=mid+1;
        }
        return left;
    }
    
    public boolean feasible(int[] bloomDay, int m, int k, int days){
        int bouquets=0;
        int flowers=0;
        for(int bloom:bloomDay){
            if(bloom<=days) 
                flowers++;
            else 
                flowers=0;
            
            if(flowers==k){
                bouquets++;
                flowers=0;
            } 
        }
        return bouquets>=m;
    }
    
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr)
            max=Math.max(max,num);
        return max;
    }
}