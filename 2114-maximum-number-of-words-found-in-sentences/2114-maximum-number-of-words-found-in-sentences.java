class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int MAX = 0;
        
        for(int i=0; i<sentences.length; i++){
            String[] words = sentences[i].split(" ");
            
            if(words.length>MAX){
                MAX = words.length;
            }
        }
        
        return MAX;
        
    }
}