class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> hm = new HashMap<>();
        return helper(s,wordDict,hm);
    }
    
    public boolean helper(String s, List<String> wordDict,HashMap<String,Boolean> hm) {
        if(hm.containsKey(s)) return hm.get(s);
        if(s=="")return true;
        
        for(String word:wordDict){
            if(s.indexOf(word)==0){
                String suffix = s.substring(word.length());
                Boolean result = helper(suffix, wordDict,hm);
                hm.put(suffix,result);
                if(result) return true;
            }
        }
        hm.put(s,false);
        return false;
    }
}