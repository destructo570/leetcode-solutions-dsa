class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=1, right=max(bloomDay);
        
        while(left<right){
            int mid=left+(right-left)/2;
            
            if(feasible(bloomDay, m, k, mid))
                right=mid;
            else left=mid+1;
        }
        return feasible(bloomDay, m, k,left)?left:-1;
    }
    
    public boolean feasible(int[] bloomDay, int m, int k, int days){
        int count=0;
        
        int adj=0;
        for(int bloom:bloomDay){
            if(bloom<=days) adj++;
            else adj=0;
            
            if(adj==k){
                count++;
                adj=0;
            } 
        }
        return count>=m;
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