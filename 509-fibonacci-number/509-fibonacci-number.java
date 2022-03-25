class Solution {
    public int fib(int n) {
        //0,1,1,2,3
        if(n==0) return 0;
        int p=0;
        int c=1;
        
        for(int i=0; i<n-1; i++){
            int next=p+c;
            p=c;
            c=next;
        }
        
        return c;
    }
}