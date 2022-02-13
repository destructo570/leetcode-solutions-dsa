class Solution {
    public boolean isPalindrome(int x) {
        
        String num = Integer.toString(x);
        boolean result = true;
        for(int i=1; i<=num.length()/2; i++){
            if(num.charAt(i-1) != num.charAt(num.length()-i)){
                result = false;
                break;
            }
        }
        return result;
    }
}