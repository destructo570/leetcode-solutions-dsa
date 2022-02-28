// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s1 = br.readLine().trim();
            String s2 = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.add(s1, s2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String add(String num1, String num2)
    {
       if(num1.length()<num2.length()){
            String tmp=num1;
            num1=num2;
            num2=tmp;
        }
        StringBuilder result = new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(j>=0){
            int res=0;
            int n1 = (int)num1.charAt(i)-48;
            int n2 = (int)num2.charAt(j)-48;
            if(n1+n2+carry >=10){
                res=(n1+n2+carry)%10;
                carry=1;
            }else {
                res=n1+n2+carry;
                carry=0;
            }

            result.append(res);
            i--;
            j--;
        }

        while (i>=0){
            int res=0;
            int n1 = (int)num1.charAt(i)-48;
            if(carry>0 && n1+carry>=10){
                res=(n1+carry)%10;
                carry=1;
            }else {
                res=n1+carry;
                carry=0;
            }
            result.append(res);
            i--;
        }

        if(carry>0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}