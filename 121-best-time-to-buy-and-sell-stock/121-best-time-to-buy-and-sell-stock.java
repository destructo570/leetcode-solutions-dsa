class Solution {
    public int maxProfit(int[] prices) {
        //get max profit 
        //choosing lowest buy and max sell
        //keeping track of max profit so far
        int lowest = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        
        for(int i=1; i<prices.length; i++){
            int profit = prices[i]-lowest;
            if(profit>maxProfit) maxProfit=profit;
            if(prices[i]<lowest) lowest=prices[i];
        }
        
        return maxProfit < 0 ? 0 : maxProfit;
    }
}