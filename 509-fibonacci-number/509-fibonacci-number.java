class Solution {
    public int fib(int n) {
        return iterative(n);
    }
    
    public int iterative(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int a=0; int b=1;
        for(int i=2; i<=n; i++){
            int f = a+b;
            a=b;
            b=f;
        }
        return b;
    }
    
    public int recursive(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        return recursive(n-1)+recursive(n-2);
    }
}