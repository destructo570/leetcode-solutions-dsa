// { Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }// } Driver Code Ends


class Solution{
  //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int l, int r)
    {
        if(l>=r) return;

        int pi= partition(arr, l, r);
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
    }
    static int partition(int arr[], int l, int r)
    {
        int pivot = arr[r];
        int i=l;
        int j=l;
         while (i<= r){
            if(arr[i]<=pivot){
                  swap(arr, i, j);
                  j++;
            }
            i++;
      }

      return j-1;
    } 

    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
