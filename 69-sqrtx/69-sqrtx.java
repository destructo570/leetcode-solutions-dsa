class Solution {
    public int mySqrt(int x) {
        return bruteForce(x);
    }
    
    public int bruteForce(int x) {
       if(x==0) return 0;

        for(int i=1; i<=Math.sqrt(x); i++)
            if(i*i <= x && i+1>x/(i+1)) return i;
        return 0;
    }
    
    public int binarySearch(int x) {
        if(x==0) return 0;
        int left=1; int right=x;
        while(true){
            int mid = (right+left)/2;
            if(mid>x/mid){
                right=mid-1;
            }else{
                if(mid+1>x/(mid+1))
                    return (int)mid;
                left=mid+1;
            }
        }
    }
    
    
    public int newton(int x) {
        if(x==0) return 0;
        int left=1; int right=x;
        while(true){
            int mid = (right+left)/2;
            if(mid>x/mid){
                right=mid-1;
            }else{
                if(mid+1>x/(mid+1))
                    return (int)mid;
                left=mid+1;
            }
        }
    }
}