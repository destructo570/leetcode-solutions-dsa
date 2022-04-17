class Solution {
    public int reverse(int x) {
        boolean flag = false;
        long num = (long)x;
        long result = 0;
        
        if(x<0){
            flag=true;
            num = getReverse(x);
        }
        
        
        while(num!=0){
            long tmp = num%10;
            result = (result*10)+tmp;
            num=num/10;
            
        }
        
        
        if(flag)
            result=getReverse(result);
        
        
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)
            return 0;
        
        return (int)result;
    }
    
    public long getReverse(long x){
        return -x;
    }
}