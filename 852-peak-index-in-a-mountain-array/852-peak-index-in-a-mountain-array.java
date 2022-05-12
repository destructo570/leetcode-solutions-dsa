class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0; int right=arr.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            
            if(mid==0){
                if(arr[mid+1]<arr[mid]){
                    return mid;
                }else{
                    left=mid+1;
                }
            }else if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }else if(arr[mid-1]>arr[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return 0;
    }
}