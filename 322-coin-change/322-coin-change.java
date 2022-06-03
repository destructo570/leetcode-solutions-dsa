class Solution {
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        return helper(coins, amount, hm);
    }
    
    public int helper(int[] coins, int amount, HashMap<Integer,Integer> hm) {
        if(hm.containsKey(amount)) return hm.get(amount);
        if(amount==0) return 0;
        if(amount<0) return -1;
        
        int min = Integer.MAX_VALUE;
        
        for(int coin:coins){
            int result = helper(coins, amount-coin, hm);
            //hm.put(amount-coin, result);
            if(result>=0 && result<min){
                min=result+1;
            }
        }
        
        hm.put(amount, min==Integer.MAX_VALUE?-1:min);
        return hm.get(amount);
    }
}