class Solution {
    public static int[][] merge(int[][] arr) {
        Arrays.sort(arr, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        int j=0;
        for(int k=0; k<arr.length; k++){
            if(arr[j][1]>=arr[k][0])
                arr[j] = new int[]{arr[j][0], Math.max(arr[j][1], arr[k][1])};
            else
                arr[++j] = arr[k];
        }

        return Arrays.copyOfRange(arr, 0, j+1);
    }
}