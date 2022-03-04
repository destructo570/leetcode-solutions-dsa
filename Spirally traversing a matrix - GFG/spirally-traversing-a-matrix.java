// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int R, int C)
    {
        int TR = C-1;
        int TL = 0;
        int BR = R-1;
        int BL = 0;
        int elements = R*C;

        ArrayList<Integer> result = new ArrayList<>();

        while (result.size() < elements){
            //TraverseRight
            for(int j=BL; j<=TR && result.size() < elements; j++){
                result.add(matrix[TL][j]);
            }
            //TraverseBottom
            for(int j=TL+1; j<=BR-1 && result.size() < elements; j++){
                result.add(matrix[j][TR]);
            }
            //TraverseLeft
            for(int j=TR; j>=BL && result.size() < elements; j--){
                result.add(matrix[BR][j]);
            }
            //TraverseUp
            for(int j=BR-1; j>=TL+1 && result.size() < elements; j--){
                result.add(matrix[j][BL]);
            }
            TL++;TR--;BL++;BR--;
        }

        return result; 
    }
}
