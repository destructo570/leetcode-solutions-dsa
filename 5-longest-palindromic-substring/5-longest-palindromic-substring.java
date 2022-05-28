class Solution {
    int startIndex=0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return s.substring(startIndex, startIndex+maxLen);
    }
    
    public void extendPalindrome(String s, int start, int end){
        
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        
        if(maxLen<(end-start-1)){
            startIndex=start+1;
            maxLen=(end-start-1);
        }
        
    }
}