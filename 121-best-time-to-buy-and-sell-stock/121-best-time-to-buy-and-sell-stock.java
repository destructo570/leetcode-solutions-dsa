class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProfit = 0;
        
        for(int i=1; i<prices.length; i++){
            int profit = prices[i]-lowest;
            if(profit>maxProfit) maxProfit=profit;
            if(prices[i]<lowest) lowest=prices[i];
        }
        
        return maxProfit;
    }
}