class Solution {
    public String smallestSubsequence(String s) {
        Stack<Integer> st = new Stack<>();
        boolean[] seen = new boolean[26];
        int[] lastIndex = new int[26];
        
        
        for(int i=0; i<s.length(); i++)
            lastIndex[s.charAt(i)-'a']=i;
        
        for(int i=0; i<s.length(); i++){
            int curr=s.charAt(i)-'a';
            if(seen[curr]) continue;
            
            while(!st.isEmpty() && st.peek()>curr && i<lastIndex[st.peek()])
                seen[st.pop()]=false;
            
            st.push(curr);
            seen[curr]=true;
        }
        
        
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty())
            result.append((char) (st.pop()+'a'));
        return result.reverse().toString();
    }
}