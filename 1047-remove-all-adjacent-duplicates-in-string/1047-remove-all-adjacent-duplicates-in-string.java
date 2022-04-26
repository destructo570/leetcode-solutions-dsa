class Solution {
    public String removeDuplicates(String s) {
        
        int index=0;
        char[] c = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            if(index==0){
                c[index++]=s.charAt(i);
            }else if(c[index-1]==s.charAt(i)){
                index--;
            }else{
                c[index++]=s.charAt(i);
            }
        }
        return new String(c,0,index);
    }
    
    public String removeDuplicatesUsingStack(String s) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i)-'a';
            if(!st.isEmpty() && curr==st.peek()){
                st.pop();
            }else st.push(curr);
            
        }
        
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty())
            result.append((char) (st.pop()+'a'));
        return result.reverse().toString();
    }
}