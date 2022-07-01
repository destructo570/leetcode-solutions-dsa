class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int count=0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        for(int j=n-2; j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1], height[j]);
        }
            
        for(int k=1; k<n;k++){
            leftMax[k]=Math.max(leftMax[k-1], height[k]);
        }
        
        for(int i=0; i<height.length;i++){
//             int leftMax = 0;    
//             int rightMax = 0;    
            
//             for(int j=i-1; j>=0;j--){
//                 leftMax=Math.max(leftMax, height[j]);
//             }
            
//             for(int k=i+1; k<height.length;k++){
//                 rightMax=Math.max(rightMax, height[k]);
//             }
            
            
            int calc = Math.min(leftMax[i], rightMax[i])-height[i];
            count+= calc >=0 ? calc : 0;
        }
        return count;
    }
}