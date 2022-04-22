class Solution {
    public double myPow(double x, int n) {    
        if(n<0){
            n = -n;
            x=1/x;
        }
        
        return getPow(x, n);
    }
    
    public double getPow(double num, int pow){
        if(pow == 0) return 1;
        
        if(pow%2==0)
            return getPow(num*num, pow/2);
        else
            return getPow(num*num, pow/2)*num; 
    }
}