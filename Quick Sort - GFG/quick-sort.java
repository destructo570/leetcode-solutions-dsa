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


class Solution
{
static void quickSort(int arr[], int low, int high)
    {
        if(low >= high){
            return;
        }
        int pivot = arr[high];
        int leftP = partition(arr, low, high, pivot);
        quickSort(arr, low, leftP-1);
        quickSort(arr, leftP+1, high);       
    }
    static int partition(int arr[], int low, int high, int pivot)
    {
        int leftP = low;
        int rightP = high;
         
        while(leftP < rightP){
            while(leftP < rightP && arr[leftP] <= pivot){
                leftP++;
            }
            while(leftP < rightP && arr[rightP] >= pivot){
                rightP--;
            }
            swap(arr, leftP, rightP);
        }
        swap(arr, leftP, high);
        return leftP;
    } 
    static void swap(int arr[], int firstNum, int secondNum)
    {
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

}
