class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int TopRight = 0;
        int BottomLeft = 0;
        int TopBottom = 1;
        int BottomTop = 1;
        int count = 0;

        ArrayList<Integer> result = new ArrayList<>();

        int k=0;
        int l=0;

        while (count!=(col*row)){
            for(int j=TopRight; j<matrix[0].length-TopRight; j++){
                if(count!=(col*row)){
                    result.add(matrix[k][j]);
                    count++;
                }else break;
            }
            TopRight++;

            for(int j=TopBottom; j<row-TopBottom; j++){
                if(count!=(col*row)){
                    result.add(matrix[j][(col-1)-l]);
                    count++;
                }else break;
            }
            TopBottom++;

            for(int j=(col-1)-BottomLeft; j>=BottomLeft; j--){
                if(count!=(col*row)){
                    result.add(matrix[(row-1)-k][j]);
                    count++;
                }else break;
            }
            BottomLeft++;

            for(int j=(row-BottomTop)-1; j>=BottomTop; j--){
                if(count!=(col*row)){
                    result.add(matrix[j][l]);
                    count++;
                }else break;
            }
            BottomTop++;

            l++;
            k++;
        }

        return result;
    }
}