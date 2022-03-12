class Solution {
    public void sortColors(int[] nums) {
        
        int[] res = mergeSort(nums, 0, nums.length-1, (nums.length-1)/2);
        for(int i=0; i<nums.length; i++){
            nums[i]=res[i];
        }
        
    }
    
    public int[] mergeSort(int[] arr,int l,int r,int m){
        
        if(l==r){
            int[] n = new int[1];
            n[0]=arr[l];
            return n;
        }
        
        int[] left = mergeSort(arr, l, m, (l+m)/2);
        int[] right = mergeSort(arr, m+1, r, ((m+1)+r)/2);
        return mergeSortedArrays(left,right);
    }
    
    public int[] mergeSortedArrays(int[] a, int[] b){
//         int[] a = new int[m-l+1];
//         int[] b = new int[r-m];
//         int[] result = new int[r-l+1];
//         int n1 = 0;
//         int n2 = 0;
//         int n3 = 0;
        
        
//         for(int i=0; i<a.length; i++){
//             a[i]=arr[l+i];
//         }
        
//         for(int i=0; i<b.length; i++){
//             b[i]=arr[m+i+1];
//         }
        
//         int p,q,r;
        int[] result=new int[a.length+b.length];
        int j=0; int k=0; int l=0;
        
        while(j!=a.length && k!=b.length){
            if(a[j]<b[k]){
                result[l]=a[j];
                j++;
                l++;
            }else{
                result[l]=b[k];
                k++;
                l++;
            }
        }
        
         while(j!=a.length){
                result[l]=a[j];
                j++;
                l++;
         }
        
        while(k!=b.length){
                result[l]=b[k];
                k++;
                l++;
         }
        
        return result;
        
    }
}