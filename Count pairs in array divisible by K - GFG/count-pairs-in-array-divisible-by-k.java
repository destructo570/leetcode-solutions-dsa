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
    public static int countKdivPairs(int A[], int n, int K)
    {
                //code here        
    int[] freq = new int[K];

    // Count occurrences of all remainders

    for (int i = 0; i < n; i++)

        ++freq[A[i] % K];

    // If both pairs are divisible by 'K'

    int sum = freq[0] * (freq[0] - 1) / 2;

    // count for all i and (k-i)

    // freq pairs

    for (int i = 1; i <= K / 2 && i != (K - i); i++)

        sum += freq[i] * freq[K - i];

    // If K is even

    if (K % 2 == 0)

        sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);

    return sum;
    }
}