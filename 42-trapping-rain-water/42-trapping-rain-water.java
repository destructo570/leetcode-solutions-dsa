class Solution {
    public int trap(int[] height) {
        return twoPointer(height);
    }
    
    public int dp(int[] height) {
        
        int answer = 0;
        
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0]=height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }
        
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i]=Math.max(rightMax[i+1], height[i]);
        }
   
         for(int i=0; i<height.length; i++){
            answer += (Math.min(leftMax[i], rightMax[i])-height[i]);
        }
        
        return answer;
    }
    
    public int brute(int[] height) {
        
        int answer = 0;
        
        
        for(int i=0; i<height.length; i++){
            int leftMax=0;
            int rightMax=0;
            
            for(int k=i; k>=0; k--){
                leftMax=Math.max(leftMax, height[k]);
            }
            
            for(int j=i; j<height.length; j++){
                rightMax=Math.max(rightMax, height[j]);
            }
            answer += (Math.min(leftMax, rightMax)-height[i]);
        }
        return answer;
    }
    
    public int twoPointer(int[] height) {
        // time : O(n)
        // space : O(1)
        if (height.length==0) return 0; 
        int left = 0, right = height.length-1; 
        int leftMax=0, rightMax=0; 
        int ans = 0; 
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left]; 
            if (height[right] > rightMax) rightMax = height[right];
            if (leftMax < rightMax) {
                ans += Math.max(0, leftMax-height[left]); 
                left++; 
            } else {
                ans += Math.max(0, rightMax-height[right]); 
                right--; 
            }
        }
        return ans; 
    }
}