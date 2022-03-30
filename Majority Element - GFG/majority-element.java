// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
            
        for(int i=0; i<nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            
        for(HashMap.Entry<Integer, Integer> entry: hm.entrySet())
            if(entry.getValue()>nums.length/2)
                return entry.getKey();
            
        return -1;
    }
}