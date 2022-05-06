class Solution {
        int startIndex=0;
        int maxLength=0;
    public String longestPalindrome(String s) {
        
        for(int i=0; i<s.length(); i++){
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return s.substring(startIndex, startIndex+maxLength);
        
    }
    
    public void extendPalindrome(String str, int start, int end){
        while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }
        if(maxLength < (end-start-1)){
            startIndex = start+1;
            maxLength = end-start-1;
        }
    }
}