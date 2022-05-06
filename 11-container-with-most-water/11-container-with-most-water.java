class Solution {
    public int maxArea(int[] height) {
        int l=0; int r=height.length-1;
        int max=0;
        for(int i=0; i<height.length; i++){
            max = Math.max(max, Math.min(height[l], height[r])*(r-l));
            
            if(height[l]<height[r]) l++;
            else r--;   

        }
        
        return max;
    }
}