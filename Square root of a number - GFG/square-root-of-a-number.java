// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x){
		long left=1; long right=x;
		
		while(left<=right){
		    long mid=(left+right)/2;
		    
		    if(mid<=x/mid && mid+1>x/(mid+1))
		        return mid;
		    else if(mid>x/mid)
		        right=mid-1;
		    else
		        left=mid+1;
		    
		}
		return -1;
	 }
	 
	long floorSqrtNewton(long x){
		long result=x;
		while(result*result>x)
		    result=(result+(x/result))/2;
		return result;
	 }
}
