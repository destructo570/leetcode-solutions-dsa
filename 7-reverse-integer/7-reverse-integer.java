class Solution {
    public int reverse(int x) {
        boolean flag = x<0;
        long result = 0;
        
        while(x!=0){
            long tmp = x%10;
            result = (result*10)+tmp;
            x=x/10;
            
        }
        
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)
            return 0;
        
        return (int)result;
    }
    
    public long getReverse(long x){
        return -x;
    }
}