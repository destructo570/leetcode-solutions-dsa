class Solution {
    public String removeDuplicates(String s) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            int curr = s.charAt(i)-'a';
            if(!st.isEmpty() && curr==st.peek()){
                st.pop();
            }else{
                st.push(curr);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty())
            result.append((char) (st.pop()+'a'));
        return result.reverse().toString();
    }
}