// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int[] a = new int[(m-l)+1];
        int[] b = new int[r-m];

        for(int i=0; i<a.length; i++){
            a[i]=arr[l+i];
        }

        for(int i=0; i<b.length; i++){
            b[i]=arr[(m+1)+i];
        }

        int i=0; int j=0; int k=l;

        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                k++;
                i++;
            }else{
                arr[k]=b[j];
                j++;
                k++;
            }

        }

        while(i<a.length){
            arr[k]=a[i];
            k++;
            i++;
        }

        while (j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
}
