// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int B)
    {
         if(A.length<B) return -1;
        int left=0, right=0;

        for(int i=0;i<A.length;i++) {
            right += A[i];
            left = Math.min(left,A[i]);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            if(feasible(A,B,mid)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    
    
    public static boolean feasible(int[] arr, int students, int pages){
        int count=1, total=0;

        for(int num:arr){
            if (num > pages)
                return false;
            total+=num;
            if(total>pages){
                total=num;
                count++;
                if(count>students) return false;
            }
        }
        return true;
    }

    public static int maxSum(int[] arr){
        int sum=0;
        for(int num:arr)
            sum+=num;
        return sum;
    }

    public static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int num:arr)
            min=Math.min(min,num);
        return min;
    }

    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr)
            max=Math.max(max,num);
        return max;
    }
};