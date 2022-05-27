class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }

    public String bruteForce(String[] strs) {
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
                if(s.charAt(i)!=chk.charAt(i))
                    return result.isEmpty() ? "" : result;
            }
            result=result+chk.charAt(i);
        }
        
        return result;
    }

}