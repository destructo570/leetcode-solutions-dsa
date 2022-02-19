class Solution {
    public int[] sortArray(int[] nums) {
        
        return mergeSort(nums);
        
    }
    
    public static int[] mergeSort(int[] arr){
        if(arr.length<=1) return arr;

        int midIdx= (arr.length)/2;

        int[] l = mergeSort(Arrays.copyOfRange(arr, 0, midIdx));
        int[] r = mergeSort(Arrays.copyOfRange(arr, midIdx, arr.length));
        return mergeSortedArrays(l, r);
    }

    public static int[] mergeSortedArrays(int[] a, int[] b){
        int[] result = new int[a.length + b.length];

        int i=0; int j=0; int k=0;

        while (i< a.length && j<b.length){

            if(a[i]<b[j]){
                result[k]=a[i];
                k++;
                i++;
            }else {
                result[k] = b[j];
                k++;
                j++;
            }

        }

        while(i < a.length){
            result[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length){
            result[k] = b[j];
            k++;
            j++;
        }

        return result;
    }
}