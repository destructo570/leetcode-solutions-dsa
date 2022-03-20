class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        //Iterate over the matrix
        //if encounter a 0 mark that row and col to true
        //Iterate over the  matrix again and set all the marked places to 0
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }   
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(row[i]==true || col[j]==true){
                    matrix[i][j]=0;
                }
            }   
        }
    }
}