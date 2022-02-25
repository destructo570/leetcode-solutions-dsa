class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        
        int count=0;
        int N = arr.length;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(abs(arr[i]-arr[j]) <= a){
                    for (int k=j+1; k<N; k++){
                        if (abs(arr[j]-arr[k]) <= b && abs(arr[i]-arr[k]) <= c){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
        
    }
    public static int abs(int num){
        return num < 0 ? -num : num;
    }
}