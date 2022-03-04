class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int TR = matrix[0].length-1;
        int TL = 0;
        int BR = matrix.length-1;
        int BL = 0;
        int elements = matrix[0].length*matrix.length;

        ArrayList<Integer> result = new ArrayList<>();

        while (result.size() < elements){
            //TraverseRight
            for(int j=TL; j<=TR && result.size() < elements; j++){
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