class Solution {
    public int reverse(int x) {
        boolean flag = x<0;
        long num = (long)x;
        long result = 0;
        
        while(num!=0){
            long tmp = num%10;
            result = (result*10)+tmp;
            num=num/10;
            
        }
        
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)
            return 0;
        
        return (int)result;
    }
    
    public long getReverse(long x){
        return -x;
    }
}