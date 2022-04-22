class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        boolean neg = false;
        
        if(n<0){
            neg=true;
            n = -n;
        }
        
        result = getPow(x, n);
        
        return neg ? 1/result : result;
    }
    
    public double getPow(double num, int pow){
        if(pow == 0) return 1;
        
        if(pow%2==0)
            return getPow(num*num, pow/2);
        else
            return getPow(num*num, pow/2)*num; 
    }
}