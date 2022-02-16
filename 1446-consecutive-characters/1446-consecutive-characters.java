class Solution {
    public int maxPower(String s) {
        int pow=1;
        int count=0;
        int curChar = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==curChar){
                count++;
                if(count>pow){
                    pow=count;
                }
            }else{
                curChar = s.charAt(i);
                count=1;
            }
        }
        return pow;
    }
    
    
}