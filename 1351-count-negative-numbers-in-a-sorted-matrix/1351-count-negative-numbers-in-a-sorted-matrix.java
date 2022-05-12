class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            count+=count(grid[i]);
        }
        return count;
    }
    
    public int count(int[] arr){
        int left=0; int right=arr.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<0 && mid==0){
                return arr.length;
            }else if(arr[mid]<0 && arr[mid-1]>=0){
                return arr.length-mid;
            }else if(arr[mid]>=0){
                left=mid+1;
            }else{
                right=mid-1;
                }
            }
         return 0;
    }
}