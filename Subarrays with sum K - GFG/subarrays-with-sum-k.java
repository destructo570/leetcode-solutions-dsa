// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        int count=0;
        long curSum=0;
        HashMap<Long, Integer> hm = new HashMap<>();
        for(int i=0; i<N; i++){
            curSum = curSum+Arr[i];
            
            if(curSum==k){
                count++;
            }
            
            if(hm.containsKey(curSum-k)){
                count+=hm.get(curSum-k);
            }
            
            if(hm.containsKey(curSum)){
                int val = hm.get(curSum);
                hm.put(curSum, ++val);    
            }else{
                hm.put(curSum, 1);   
            }
            
        }
        
        return count;
        
    }
}