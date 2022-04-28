class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
//         for(int i=0; i<matrix.length; i++){
//             if(binarySearch(matrix[i], target)) return true;
//         }
        
//         return false;
        return searchMatrixOptimal(matrix, target);
    }
    
    public boolean searchMatrixOptimal(int[][] matrix, int target) {
      int i = 0, j = matrix[0].length - 1;
      while(i < matrix.length && j >= 0) {
        if(matrix[i][j] == target)
          return true;
        else if(matrix[i][j] > target)
          j --;
        else if(matrix[i][j] < target)
          i ++;
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