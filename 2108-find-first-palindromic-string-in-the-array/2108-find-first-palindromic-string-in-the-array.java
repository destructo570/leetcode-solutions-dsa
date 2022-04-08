class Solution {
    public String firstPalindrome(String[] words) {
        
        
        for(int k=0; k<words.length; k++){
            String res = words[k];
            boolean flag = true;
            for(int i=0; i<res.length()/2; i++){
                if(res.charAt(i) != res.charAt((res.length()-1)-i)){
                    flag=false;
                    break;
                }
            }
            if(flag) return res;
            
        }
        
        return "";
    }
}