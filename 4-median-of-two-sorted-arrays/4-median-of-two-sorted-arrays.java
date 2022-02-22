class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = mergeArrays(nums1, nums2);
        
        if(mergedArr.length%2!=0){
            return mergedArr[mergedArr.length/2];    
        }else{
            int n1=mergedArr[mergedArr.length/2];
            int n2=mergedArr[(mergedArr.length/2)-1];
            return (n1+n2)/2D;
        }
        
        
        
    }
    
    public static int[] mergeArrays(int[] a, int[] b){
        int[] res = new int[a.length+b.length];
        
        int i=0; int j=0; int k=0;
        
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                res[k]=a[i];
                i++;
                k++;
            }else{
                res[k]=b[j];
                j++;
                k++;
            }
        }
        
        while(i<a.length){
            res[k]=a[i];
            i++;
            k++;
        }
        
        while(j<b.length){
            res[k]=b[j];
            j++;
            k++;
        }
        return res;
    }
}