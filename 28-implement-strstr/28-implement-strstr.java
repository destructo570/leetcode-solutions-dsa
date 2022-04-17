class Solution {
    public static int strStr(String haystack, String needle) {

        int ptr=0;
        if(haystack.length()<needle.length()) return -1;

        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                boolean flag = true;
                ptr=i;
                for(int j=0; j<needle.length(); j++){
                    if(ptr>=haystack.length() || haystack.charAt(ptr) != needle.charAt(j)){
                        flag=false;
                        break;
                    }
                    ptr++;
                }
                if(flag) return i;
            }
        }

        return -1;
    }

}