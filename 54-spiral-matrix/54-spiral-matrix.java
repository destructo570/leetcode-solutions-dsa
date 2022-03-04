class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int col = matrix[0].length;
        int row = matrix.length;
        int TopRight = 0;
        int BottomLeft = 0;
        int TopBottom = 1;
        int BottomTop = 1;
        int elements = col*row;

        ArrayList<Integer> result = new ArrayList<>();

        int k=0;

        while (result.size() < elements){
            for(int j=TopRight; j<col-TopRight && result.size() < elements; j++){
                result.add(matrix[k][j]);
            }
            TopRight++;

            for(int j=TopBottom; j<row-TopBottom && result.size() < elements; j++){
                result.add(matrix[j][(col-1)-k]);
            }
            TopBottom++;

            for(int j=(col-BottomLeft)-1; j>=BottomLeft && result.size() < elements; j--){
                result.add(matrix[(row-1)-k][j]);
          
            }
            BottomLeft++;

            for(int j=(row-BottomTop)-1; j>=BottomTop && result.size() < elements; j--){
                result.add(matrix[j][k]);
            }
            BottomTop++;

            k++;
        }

        return result;
    }
}