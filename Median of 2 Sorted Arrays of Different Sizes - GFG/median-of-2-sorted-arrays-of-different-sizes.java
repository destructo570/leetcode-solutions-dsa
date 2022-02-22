// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
       return findMedianSortedArrays(a, b);
    }
    
    
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = mergeArrays(nums1, nums2);

        if(mergedArr.length%2!=0){
            return mergedArr[mergedArr.length/2];
        }else{
            int n1=mergedArr[mergedArr.length/2];
            int n2=mergedArr[(mergedArr.length/2)-1];
            return (n1+n2)/2D;
        }



    }

    public static int[] mergeArrays(int[] a, int[] b){
        int[] res = new int[a.length+b.length];

        int i=0; int j=0; int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                res[k]=a[i];
                i++;
                k++;
            }else{
                res[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            res[k]=a[i];
            i++;
            k++;
        }

        while(j<b.length){
            res[k]=b[j];
            j++;
            k++;
        }
        return res;
    }
}