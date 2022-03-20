// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int N, int K) {
        
        
        return solutionOne(arr, N, K);
    }
    
    public static ArrayList<Integer> solutionOne(int arr[], int N, int K){
        int max = findMax(arr, 0, K-1);;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(max);

        for(int i=K; i<N; i++){
            int removed = arr[i-K];
            int added = arr[i];
            if(removed==max){
                max = findMax(arr, (i-K)+1, i-1);
            }
            max = Math.max(max, added);

            res.add(max);
        }
        return res;
    }
    
    public static int findMax(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;

        for(int i=start; i<=end; i++)
            if(arr[i]>max)max=arr[i];

        return max;
    }
}