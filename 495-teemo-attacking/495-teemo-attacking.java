class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        //1,2,3,4,5,6,7,8 d=4 tm=[1,5]
        // ans = 8 
        //1,2,3,4,5,6,7,8 d=4 tm=[1,3]
        // 1,2,3,4,5,6 ans=6
        //6-1+1 ans=6
        //3,4,5,6,7,8 d=4 tm=[3,5] ans=6
        // 8-3+1 ans=6
        
        int prev=-1;
        int result=0;
        int n = timeSeries.length;
        for(int i=0; i<n; i++){
            if(prev>=timeSeries[i]){
                int diff = prev - timeSeries[i] + 1;
                result+=((timeSeries[i]+duration-1)-timeSeries[i]+1)-diff;
                prev=timeSeries[i]+duration-1;
            }else{
                prev=timeSeries[i]+duration-1;
                result+=(timeSeries[i]+duration-1)-timeSeries[i]+1;
            }
        }
        return result;
    }
}