// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        int count=0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]>x){
        //         break;
        //     }else if(arr[i]==x){
        //         count++;
        //     }
        // }
        
        int idx = binarySearch(arr, x);
        if(idx == -1) return 0;
        // if(idx == arr.length-1) return 1;
        
        //Check left side
        for(int i=idx; i>=0; i--){
            if(arr[i]<x){
                break;
            }else if(arr[i]==x){
                count++;
            }
        }
        
        //Check right side
        for(int i=idx+1; i<arr.length; i++){
            if(arr[i]>x){
                break;
            }else if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    
    int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int midIdx = (start+end)/2;
            int midItem = arr[midIdx];
            
            if(midItem==k){
                return midIdx;
            }else if(midItem>k){
                end=midIdx-1;
            }else{
                start=midIdx+1;
            }
        }
        
        return -1;
    }
}