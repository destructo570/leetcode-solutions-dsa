// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
       return mergeSort(arr, 0, arr.length-1);
    }
    
    
    public static long mergeSort(long[] arr, int l, int r){
        long count = 0;

        if(l<r){
            int mid = (l+r)/2;
            count += mergeSort(arr, l, mid);
            count += mergeSort(arr, mid+1, r);
            count += mergeSortedArrays(arr,l,r,mid);
        }
        return count;
    }

    public static long mergeSortedArrays(long[] arr, int l, int r, int mid){
        long count=0;
        int n1=(mid-l)+1;
        int n2=r-mid;
        long[] a = new long[n1];
        long[] b = new long[n2];

        for(int i=0; i<n1; i++){
            a[i]=arr[l+i];
        }

        for(int i=0; i<n2; i++){
            b[i]=arr[mid+i+1];
        }

        int i=0; int j=0; int k=l;

        while (i<n1 && j<n2){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }else{
                arr[k]=b[j];
                count=count+(n1-i);
                k++;
                j++;
            }

        }

        while (i<n1){
            arr[k]=a[i];
            k++;
            i++;
        }

        while (j<n2) {
            arr[k] = b[j];
            k++;
            j++;
        }
       
        return count;
    }
}