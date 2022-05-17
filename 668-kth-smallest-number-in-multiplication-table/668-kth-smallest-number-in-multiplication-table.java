class Solution {
    public int findKthNumber(int m, int n, int k) {
        int left=1; int right=m*n;
        
        while(left<right){
            int mid=left+(right-left)/2;
            if(enough(mid, m, n, k)) right=mid;
            else left=mid+1;
        }

        return left;
    }

    public boolean enough(int num, int m, int n, int k) {
        int count=0;
        
        for(int i=1; i<=m; i++){
            int add = Math.min(num/i, n);
            if (add==0) break;
            count+=add;
        }
        return count>=k;
    }
}