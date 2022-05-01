class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder a1 = new StringBuilder();
        StringBuilder a2 = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(a1.toString().length()>0)
                    a1.deleteCharAt(a1.toString().length() - 1);
            }else a1.append(s.charAt(i));
        }
        
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(a2.toString().length()>0)
                    a2.deleteCharAt(a2.toString().length() - 1);
            }else a2.append(t.charAt(i));
        }
        
        return a1.toString().equals(a2.toString());
    }
    
    public boolean backspaceCompareStacks(String s, String t) {
        
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(!s1.isEmpty())
                    s1.pop();
            }else s1.push(s.charAt(i));
        }
        
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#') {
                if(!s2.isEmpty())
                    s2.pop();
            }else s2.push(t.charAt(i));
        }
        
        if(s1.size() != s2.size()) return false;
        
        while(!s1.isEmpty())
            if(s1.pop() != s2.pop()) return false;
        
        return true;
    }
}