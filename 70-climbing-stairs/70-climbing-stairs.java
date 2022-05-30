class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        return climb(n,hm);
    }
    
    public int climb(int n,HashMap<Integer,Integer> hm) {
        if(hm.containsKey(n)) return hm.get(n);
        if(n==0||n==1) return 1;
        int result = climb(n-1,hm)+climb(n-2,hm);
        hm.put(n,result);
        return result;
    }
}