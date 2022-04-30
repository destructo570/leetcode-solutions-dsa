class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        for(char c: s.toCharArray()) {
            if ((int) c >= 65 && (int) c <= 90)
                ++arr[c - 'A'];
            if ((int) c >= 97 && (int) c <= 122)
                ++arr[c - 'a'];
        }

        for(int i=0; i<arr.length ; i++)
            if(arr[i] == 0) return false;

        return true;
    }
}