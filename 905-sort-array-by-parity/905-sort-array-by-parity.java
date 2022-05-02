class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int ptr = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                int tmp=arr[i];
                arr[i] = arr[ptr];
                arr[ptr++]=tmp;
            }
        }
        return arr;
    }
}