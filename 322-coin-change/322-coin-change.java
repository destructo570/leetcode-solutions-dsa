class Solution {
    public int coinChange(int[] coins, int amount) {
        //HashMap<Integer,Integer> hm = new HashMap<>();
        return helper(coins, amount, new int[amount]);
    }
    
    public int helper(int[] coins, int amount, int[] count) {
        if(amount==0) return 0;
        if(amount<0) return -1;
        if(count[amount-1]!=0) return count[amount-1];
        int min = Integer.MAX_VALUE;
        
        for(int coin:coins){
            int result = helper(coins, amount-coin, count);
            if(result>=0 && result<min)
                min=result+1;
        }
        
        count[amount-1]= min==Integer.MAX_VALUE?-1:min;
        return count[amount-1];
    }
}