// { Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return 0;
	}
	
	void selectionSort(int arr[], int n)
	{
	   for(int i=0; i<n; i++){
        int minIdx=i;
        for(int j=i; j<n; j++){
            if(arr[j]<arr[minIdx]){
                minIdx=j;
            }
        }
        if(i!=minIdx) swap(arr, i, minIdx);
    }
	}
	

void swap(int[] arr, int i, int j){
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j]= tmp;
}
}