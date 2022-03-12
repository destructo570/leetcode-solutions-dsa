// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int j=0; j<N; j++){
            if(A[j]>max){
                max=A[j];
            }
        }
        
        for(int j=0; j<N; j++){
            if(A[j]>max2 && A[j]!=max){
                max2=A[j];
            }
        }
        
        return max2>=0?max2:-1;
        
    }
    
    
}
        
