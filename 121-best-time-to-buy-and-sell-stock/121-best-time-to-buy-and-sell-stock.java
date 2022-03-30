class Solution {
    public int maxProfit(int[] prices) {
        int maxCur=0; int maxSoFar=0;
        
        for(int i=1; i<prices.length; i++){
            maxCur = Math.max(0, maxCur + prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
    
    public int optimalOne(int[] prices){
        int minIdx=0;
        int profit=0;
        for(int i=0; i<prices.length; i++){
             if(prices[i]<prices[minIdx]) minIdx=i;
        }
        
        for(int j=minIdx+1; j<prices.length; j++){
            if(prices[j]-prices[minIdx] > profit){
                profit = prices[j]-prices[minIdx];
            }   
        } 
        return profit;
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