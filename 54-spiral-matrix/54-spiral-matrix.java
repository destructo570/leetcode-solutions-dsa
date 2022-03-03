class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int col = matrix[0].length;
        int row = matrix.length;
        int TopRight = 0;
        int BottomLeft = 0;
        int TopBottom = 1;
        int BottomTop = 1;

        ArrayList<Integer> result = new ArrayList<>();

        int k=0;

        while (result.size()!=(col*row)){
            for(int j=TopRight; j<col-TopRight; j++){
                if(result.size()!=(col*row)){
                    result.add(matrix[k][j]);
                }else break;
            }
            TopRight++;

            for(int j=TopBottom; j<row-TopBottom; j++){
                if(result.size()!=(col*row)){
                    result.add(matrix[j][(col-1)-k]);
                }else break;
            }
            TopBottom++;

            for(int j=(col-BottomLeft)-1; j>=BottomLeft; j--){
                if(result.size()!=(col*row)){
                    result.add(matrix[(row-1)-k][j]);
                }else break;
            }
            BottomLeft++;

            for(int j=(row-BottomTop)-1; j>=BottomTop; j--){
                if(result.size()!=(col*row)){
                    result.add(matrix[j][k]);
                }else break;
            }
            BottomTop++;

            k++;
        }

        return result;
    }
}