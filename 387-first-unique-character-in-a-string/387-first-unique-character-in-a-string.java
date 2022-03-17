class Solution {
    public int firstUniqChar(String s) {
        
         return naive(s);
        
    }
    
        public static int naive(String s){
        int result=-1;

        for(int i=0; i<s.length(); i++){
            boolean found= false;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i) && i!=j){
                    found=true;
                    break;
                }
            }
            if(!found) return i;
        }
        return result;
    }
}