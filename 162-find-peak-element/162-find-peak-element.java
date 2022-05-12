class Solution {
    public int findPeakElement(int[] nums) {
        int left=0; int right=nums.length-1;
        if(nums.length<=1) return 0;
        
        while(left<right){
            int mid = (left+right)/2;
            
            if(mid==0){
                if(nums[mid+1]<nums[mid]) return mid;
                else left=mid+1;
            }else if(mid+1 >= nums.length){
                if(nums[mid-1]<nums[mid]) return mid;
                else left=mid-1;
            }else if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid]){
                return mid;
            }else if(nums[mid-1]>nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        
        return left==right?left:-1;
    }
}