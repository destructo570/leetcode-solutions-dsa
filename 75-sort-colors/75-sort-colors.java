class Solution {
    public void sortColors(int[] nums) {
        
        // int[] res = mergeSort(nums, 0, nums.length-1);
        // for(int i=0; i<nums.length; i++){
        //     nums[i]=res[i];
        // }
        sortColorsTwo(nums);
        
    }
    
    public void sortColorsTwo(int[] arr){
        int zero=0; int one=0; int two=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(zero!=0){
                arr[i]=0;
                zero--;
                
            }else if(one!=0){
                arr[i]=1;
                one--;
              
            }else{
                arr[i]=2;
                two--;
            }
        }
    }
    
    public int[] mergeSort(int[] arr,int l,int r){
        
        if(l==r){
            int[] n = new int[1];
            n[0]=arr[l];
            return n;
        }
        int m = (l+r)/2;
        
        int[] left = mergeSort(arr, l, m);
        int[] right = mergeSort(arr, m+1, r);
        return mergeSortedArrays(left,right);
    }
    
    public int[] mergeSortedArrays(int[] a, int[] b){

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