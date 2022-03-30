class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int profitIfSoldToday=0;
        int leastPriceSoFar=Integer.MAX_VALUE;


        for(int i=0; i<prices.length; i++){
            if(leastPriceSoFar>prices[i])
                leastPriceSoFar=prices[i];
            
            profitIfSoldToday = prices[i] - leastPriceSoFar;
            
            if(profitIfSoldToday>profit) profit = profitIfSoldToday;
        }
        return profit;
    }
    
    public int optimalOne(int[] prices){
        int maxCur=0; int maxSoFar=0;
        
        for(int i=1; i<prices.length; i++){
            maxCur = Math.max(0, maxCur + prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
    
    public int naive(int[] prices){
        int profit=0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]-prices[i] > profit){
                    profit = prices[j]-prices[i];
                }   
            }   
        }
        return profit;
    }
}