class Solution {
    public int fib(int n) {
        return recursive(n);
    }
    
//     public int iterative(int n) {
        
//     }
    
    public int recursive(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        return recursive(n-1)+recursive(n-2);
    }
}