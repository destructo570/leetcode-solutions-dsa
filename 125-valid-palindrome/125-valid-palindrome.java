class Solution {
    public boolean isPalindrome(String s) {
        //change uppercase to lower case
        //remove white space and special characters
        
         StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' ){
                res.append(s.charAt(i));
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                res.append(s.charAt(i));
            }else if (s.charAt(i)>='A' && s.charAt(i)<='Z')
                res.append((char)( (int)s.charAt(i)+32));
        }
        boolean flag=true;
        for(int i=0; i<res.length()/2; i++){
            if(res.charAt(i) != res.charAt((res.length()-1)-i)){
                flag=false;
            }
        }

        return flag;
    }
}