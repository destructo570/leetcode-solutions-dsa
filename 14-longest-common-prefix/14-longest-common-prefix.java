class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        
        String chk ="";
        int len = Integer.MAX_VALUE;
        for(String s:strs){
            if(s.length()<len){
                len=s.length();
                chk=s;
            }
        }
        
        for(int i=0; i<len; i++){
            for(String s:strs){
                if(s.charAt(i)!=chk.charAt(i)){
                    if(result.isEmpty()){
                        return "";
                    }else{
                        return result;
                    }
                }
            }
            
            result=result+chk.charAt(i);
            
        }
        
        return result;
    }
}