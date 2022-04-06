class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] arr = new int[m+n];
        
        int i=0; int k=0; int r=0;
        while(i<m && k<n){
            if(nums1[i]<nums2[k]){
                arr[r++]=nums1[i++];
            }else{
                arr[r++]=nums2[k++];
            }
        }
        
        while(i<m){
            arr[r++]=nums1[i++];
        }
        
        while(k<n){
           arr[r++]=nums2[k++];
        }
    
        for(int p=0; p<nums1.length; p++)
            nums1[p]=arr[p];
        
    }
}