// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i=0; i<s.length(); i++)
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        
        for(int i=0; i<s.length(); i++)
            if(hs.get(s.charAt(i))==1) return s.charAt(i);
            
        return '$';
    }
    
    static char naive(String s)
    {
        for(int i=0; i<s.length(); i++){
            boolean found= false;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i) && i!=j){
                    found=true;
                    break;
                }
            }
            if(!found) return s.charAt(i);
        }
        return '$';
    }
    
    public static int hashing(String s){
        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i=0; i<s.length(); i++)
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
        
        for(int i=0; i<s.length(); i++)
            if(hs.get(s.charAt(i))==1) return i;
            
        return -1;
    }
}

