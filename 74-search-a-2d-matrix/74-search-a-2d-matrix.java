class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchMatrixOptimal(matrix, target);
    }
    
    public boolean searchMatrixOptimal(int[][] matrix, int target) {
        int m=0; int n=matrix[0].length-1;
        
        while(m<matrix.length && n>=0){
            if(matrix[m][n]==target)
                return true;
            else if(matrix[m][n]>target)
                n--;
            else 
                m++;   
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