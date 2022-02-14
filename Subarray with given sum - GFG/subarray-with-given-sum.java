// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int num) 
    {
        // Your code here

        return optimal(arr,n ,num);
    }
    
    static ArrayList<Integer> optimal(int[] arr,int n, int num){
        
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Long, Integer> hm = new HashMap<>();
        int start = -1;
        int end =-1;
        long curSum = 0;
        
        
        for(int i=0; i<n; i++){
            curSum = curSum + arr[i];
            
            if(curSum==num){
                start=0;
                end=i;
                res.add(start+1);
                res.add(end+1);
                return res;
            }
            
            if(hm.containsKey(curSum-num)){
                start = hm.get(curSum-num);
                end = i;
                res.add(start+2);
                res.add(end+1);
                return res;
                
            }
            
            hm.put(curSum, i);
            
        }
        
        res.add(-1);
        return res;
    }
    
    static ArrayList<Integer> naive(int[] arr,int n,int num){
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum=sum+arr[j];
                if(sum==num){
                    res.add(i+1);
                    res.add(j+1);
                    return res;
                }
            }
        }
        
        res.add(-1);
        return res;
    }
}