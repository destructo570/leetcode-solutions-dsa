class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, right=max(piles);
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(feasible(piles,h,mid)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    
    public boolean feasible(int[] piles, int h, int k){
        int count=0;
        for(double num:piles)
            count+=Math.ceil(num/k);
            if(count>h) return false;
        
        return true;
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