class Solution {
    public int maxDistance(int[] colors) {
        return optimal(colors);
    }
    
    public int optimal(int[] colors) {
        int max=0;
        int i=0;
        for(int j=colors.length-1; j>=0; j--){
            if(colors[i]!=colors[j]) max = Math.max(max, Math.abs(i-j));
        }
        
        i=colors.length-1;
        for(int j=0; j<colors.length; j++){
            if(colors[i]!=colors[j]) max = Math.max(max, Math.abs(i-j));
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