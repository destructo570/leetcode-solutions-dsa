// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        
        long result=Integer.MIN_VALUE;
        long product=1;
        
        for(int i=0; i<n; i++){
            product=product*arr[i];
            result = Math.max(product, result);
            if(product==0)product=1;
        }
        product=1;
        for(int i=n-1; i>=0; i--){
            product=product*arr[i];
            result = Math.max(product, result);
            if(product==0)product=1;
        }
        return result;
    }
}

//     long maxProductNaive(int[] arr, int n) {
        
//         long result=Long.MIN_VALUE;
        
//         for(int i=0; i<n; i++){
//             long max=1;
//             for(int j=i; j<n; j++){
//                 max = max*arr[j];
//                 if(max>result)result=max;
//             }
//         }
//         return result;
        
//     }
// }