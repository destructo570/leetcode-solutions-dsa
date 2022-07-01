class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int count=0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        for(int j=n-2; j>=0;j--)
            rightMax[j]=Math.max(rightMax[j+1], height[j]);
        
            
        for(int k=1; k<n;k++)
            leftMax[k]=Math.max(leftMax[k-1], height[k]);
        
        for(int i=0; i<height.length;i++){
            int calc = Math.min(leftMax[i], rightMax[i])-height[i];
            count+= Math.min(leftMax[i], rightMax[i])-height[i];
        }
        return count;
    }
}