class Solution {
    public int trap(int[] height) {
        HashMap<String,Integer> hm = new HashMap<>();
        
        return dp(height);
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
    
    public int helper(int[] height, int i, int j, HashMap<String,Integer> hm) {
        if(i>=j || i+1==j || j-1==i) return 0;
        if(hm.containsKey(i+","+j)) return hm.get(i+","+j);
        int left = helper(height, i+1, j, hm);
        int right = helper(height, i, j-1, hm);
        
        int elevation = Math.min(height[i], height[j]);
        int result = elevation + Math.max(left, right);
        hm.put(i+","+j, result);
        return result;
    }
}