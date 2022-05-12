class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int left=1; int right=n-2;
        if(nums.length<=1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid-1]>nums[mid]) right=mid-1;
            else left=mid+1;
        }
        
        return -1;
    }
}