class Solution {
    public int maxDistance(int[] colors) {
        return optimal(colors);
    }
    
    public int optimal(int[] colors) {
        int max=0, n = colors.length;
        for(int i=0; i<n; i++){
            if(colors[i]!=colors[n-1]) max = Math.max(max, n-1-i); 
            if(colors[0]!=colors[i]) max = Math.max(max, i);
        }
        return max;
    }
    
    public int bruteForce(int[] colors) {
        int max=0;
        for(int i=0; i<colors.length; i++){
            for(int j=0; j<colors.length; j++)
                if(colors[i]!=colors[j]) max = Math.max(max, Math.abs(i-j));   
        }
        return max;
    }
}