class Solution {
    public int coinChange(int[] coins, int amount) {
    if(amount<1) return 0;
    return helper(coins, amount, new int[amount]);
}

private int helper(int[] coins, int rem, int[] count) { // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
    if(rem<0) return -1; // not valid
    if(rem==0) return 0; // completed
    if(count[rem-1] != 0) return count[rem-1]; // already computed, so reuse
    int min = Integer.MAX_VALUE;
    for(int coin : coins) {
        int res = helper(coins, rem-coin, count);
        if(res>=0 && res < min)
            min = 1+res;
    }
    count[rem-1] = (min==Integer.MAX_VALUE) ? -1 : min;
    return count[rem-1];
}
//     public int coinChange(int[] coins, int amount) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         return helper(coins, amount, hm);
//     }
    
//     public int helper(int[] coins, int amount, HashMap<Integer,Integer> hm) {
//         if(hm.containsKey(amount)) return hm.get(amount);
//         if(amount==0) return 0;
//         if(amount<0) return -1;
        
//         int min = Integer.MAX_VALUE;
        
//         for(int coin:coins){
//             int result = helper(coins, amount-coin, hm);
//             if(result>=0 && result<min)
//                 min=result+1;
//         }
        
//         hm.put(amount, min==Integer.MAX_VALUE?-1:min);
//         return hm.get(amount);
//     }
}