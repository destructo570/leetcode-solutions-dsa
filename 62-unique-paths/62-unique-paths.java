class Solution {
    public int uniquePaths(int m, int n) {
        HashMap<String,Integer> hm = new HashMap<>();
        return solve(m,n,hm);
    }
    
    public int solve(int m, int n, HashMap<String,Integer> hm) {
        if(hm.containsKey(m+","+n)) return hm.get(m+","+n);
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        
        int result = solve(m-1, n,hm)+solve(m, n-1,hm);
        hm.put(m+","+n, result);
        hm.put(n+","+m, result);
        return result;
    }
}