class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = {-1,-1};
        
        int left=0; int right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(nums[mid]==target){
                if(mid==0 || nums[mid-1]!=target){
                    result[0]=mid;
                    break;
                }else{
                    right=mid-1;
                }
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        left=0; right=nums.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(nums[mid]==target){
                if(mid==nums.length-1 || nums[mid+1]!=target){
                    result[1]=mid;
                    break;
                }else{
                    left=mid+1;
                }
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        return result;
    }
}