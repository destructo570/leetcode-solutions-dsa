class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return naive(temperatures);
    }
    
    public int[] naive(int[] arr) {
        int[] result = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i+1; j<arr.length; j++){
                count++;
                if(arr[j]>arr[i]){
                    result[i]=count;            
                    break;
                }
            }
        }
        
        return result;
    }
}