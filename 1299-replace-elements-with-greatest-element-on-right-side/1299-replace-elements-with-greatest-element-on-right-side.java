class Solution {
    public int[] replaceElements(int[] arr) {
        
        int curMax = -1;
        
        for(int i=arr.length-1; i>=0; i--){
            int tmp = arr[i];
            arr[i]=curMax;
            curMax = Math.max(tmp, curMax);
        }
        return arr;
    }
}