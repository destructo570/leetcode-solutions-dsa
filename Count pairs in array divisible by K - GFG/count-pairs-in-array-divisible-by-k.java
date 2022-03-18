// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int countKdivPairs(int arr[], int n, int K)
    {
                //code here        
        int[] f=new int[K];
        for(int i=0; i<arr.length; i++)
            ++f[arr[i]%K];

        int count= f[0]*(f[0]-1)/2;

        for(int i=1; i<=K/2 && i!=(K-i); i++){
                count+=f[i]*f[K-i];
        }

        if(K%2==0)
            count+=(f[K/2]*(f[K/2]-1)/2);
        return count;
    }
}