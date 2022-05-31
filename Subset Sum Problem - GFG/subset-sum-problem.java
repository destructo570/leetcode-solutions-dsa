// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        return solve(N,arr,sum,hm);
    }
    
    static Boolean solve(int N, int arr[], int sum,HashMap<Integer, Boolean> hm){
        if(sum==0) return true;
        if(sum<0) return false;
        if(hm.containsKey(sum)) return hm.get(sum);
        for(int i=0; i<N; i++){
            
            if(arr[i]>=0){
                arr[i]=-arr[i];
                boolean res = solve(N,arr,sum-(-arr[i]),hm);
                hm.put(sum,res);
                arr[i]=-arr[i];
                if(res) return true;
            }
        }
        
        return false;
    }
}