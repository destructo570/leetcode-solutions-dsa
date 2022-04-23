class Solution {
    public static int[][] merge(int[][] arr) {
        
        quickSort(arr, 0, arr.length-1);
        int row=arr.length;
        int col=arr[0].length;

        int j=0;
        for(int k=0; k<row; k++){
            if(arr[j][0]>=arr[k][0])
                arr[j] = new int[]{arr[k][0], Math.max(arr[j][1], arr[k][1])};
            else if(arr[j][1]>=arr[k][0])
                arr[j] = new int[]{arr[j][0], Math.max(arr[j][1], arr[k][1])};
            else
                arr[++j] = arr[k];
        }

        return Arrays.copyOfRange(arr, 0, j+1);
    }
    
    

    
    public static void quickSort(int[][] arr, int l, int r){
        if(l<r) {
        int pi = partitionIndex(arr, l, r);
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
        }
    }

    public static int partitionIndex(int[][] arr, int l, int r){
        int[] pivot = arr[r];
        int i=l;
        int j=l;
        while (i<=r){
            if(arr[i][0]<pivot[0]){
                swap(arr, i, j);
                j++;
            }if(arr[i][0]==pivot[0] && arr[i][1]<=pivot[1]){
                swap(arr, i, j);
                j++;
            }
            i++;
        }

        return j-1;
    }

    public static void swap(int[][] arr, int i, int j){
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}