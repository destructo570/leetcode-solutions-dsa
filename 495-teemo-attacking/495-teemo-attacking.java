class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int prev=-1;
        int result=0;
        int n = timeSeries.length;
        for(int i=0; i<n; i++){
            if(prev>=timeSeries[i])
                result+=duration-(prev - timeSeries[i] + 1);
            else 
                result+=duration;
            prev=timeSeries[i]+duration-1;
        }
        return result;
    }
}