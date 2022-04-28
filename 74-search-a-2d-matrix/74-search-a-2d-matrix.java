class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0; i<matrix.length; i++){
            if(binarySearch(matrix[i], target)) return true;
        }
        
        return false;
    }
    
    public boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            int item = arr[mid];
            
            if(item==target){
                return true;
            }else if(item<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return false;
    }
}