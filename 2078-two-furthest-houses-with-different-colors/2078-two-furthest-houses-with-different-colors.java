class Solution {
    public int maxDistance(int[] colors) {
        return optimal(colors);
    }
    
    public int optimal(int[] colors) {
        int max=0;
        int j=colors.length-1;
        for(int i=0; i<colors.length; i++){
            if(colors[i]!=colors[j]) max = Math.max(max, Math.abs(i-j)); 
            if(colors[0]!=colors[j-i]) max = Math.max(max, Math.abs((i-i)-(j-i)));
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