// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
         return optimal(a,b);
        
    }
    
    public static boolean optimal(String s1, String s2){
        int[] h1 = new int[(int)'z'+1];
        int[] h2 = new int[(int)'z'+1];

        if(s1.length() != s2.length()){
            // System.out.println("NO");
            return false;
        }

        for(int i=0; i<s1.length(); i++){
            h1[(int)s1.charAt(i)]++;
            h2[(int)s2.charAt(i)]++;
        }

        for(int i=0; i<h1.length; i++){
            if(h1[i] != h2[i]){
 
                return false;
            }
        }

   
        return true;
    }
}