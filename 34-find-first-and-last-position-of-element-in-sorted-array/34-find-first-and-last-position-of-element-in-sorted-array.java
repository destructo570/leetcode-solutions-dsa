class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int[] result = {-1,-1};
        
        int left=0; int right=arr.length-1;
        
        
        while(left<=right){
            int mid=(left+right)/2;
            
            if(mid==0 && arr[mid]==target){
                result[0]=mid;
                break;
            }else if(arr[mid]==target && arr[mid-1]!=target){
                result[0]=mid;
                break;
            }else if(arr[mid]<target)
                left=mid+1;
            else right=mid-1;
        }
        
        left=0; right=arr.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            
            if(mid==arr.length-1 && arr[mid]==target){
                result[1]=mid;
                break;
            }else if(arr[mid]==target && arr[mid+1]!=target){
                result[1]=mid;
                break;
            }else if(arr[mid]<=target)
                left=mid+1;
            else right=mid-1;
        }
        
        return result;
    }
}