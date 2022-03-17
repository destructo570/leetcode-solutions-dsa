class Solution {
    public int firstUniqChar(String s) {
        
         return hashing(s);
        
    }
    
    public static int hashing(String s){
        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i=0; i<s.length(); i++)
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        
        for(int i=0; i<s.length(); i++)
            if(hs.get(s.charAt(i))==1) return i;
            
        return -1;
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