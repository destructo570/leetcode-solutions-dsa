// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int maximumSumSubarray(int n, ArrayList<Integer> arr,int G){
        // code here
        
        int sum = 0;
        int max=0;
        
        for(int i=0; i<n; i++)
            sum+=arr.get(i);
        
        max=sum;

        for(int i=n; i<arr.size(); i++){
            sum = sum - arr.get(i-n) + arr.get(i);
            if(sum>max) max=sum;
        }
        return max;
    }
}