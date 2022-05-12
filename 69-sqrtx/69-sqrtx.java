class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int left=1; int right=x;
        while(true){
            long mid = (right+left)/2;
            
            if(mid>x/mid){
                right= (int) mid-1;
            }else{
                if(mid+1>x/(mid+1))
                    return (int)mid;
                left= (int) mid+1;
            }
        }
    }
}