class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] h1 = new int[(int)'z'+1];
        int[] h2 = new int[(int)'z'+1];
        
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length(); i++){
            h1[(int)s.charAt(i)]++;
            h2[(int)t.charAt(i)]++;
        }
        
        for(int i=0; i<h1.length; i++){
            if(h1[i] != h2[i]){
                return false;
            }
        }
        
        return true;
    }
}