class Solution {
    public static int[][] merge(int[][] intervals) {
        
        quickSort(intervals, 0, intervals.length-1);
        int row=intervals.length;
        int col=intervals[0].length;
        
        //if(row==1) return intervals;

        int j=0;
        for(int k=0; k<row; k++){
            int[] a = intervals[j];
            int[] b = intervals[k];
            
            if(a[0]>=b[0])
                intervals[j] = new int[]{b[0], Math.max(a[1], b[1])};
            else if(a[1]>=b[0])
                intervals[j] = new int[]{a[0], Math.max(a[1], b[1])};
            else
                intervals[++j] = intervals[k];
        }

        return Arrays.copyOfRange(intervals, 0, j+1);
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