class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return naive(nums1, nums2);
    }
    
    public int[] naive(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int ptr=0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    boolean flag = false;
                    for(int k=j+1; k<nums2.length; k++){
                        if(nums2[k]>nums2[j]){
                            result[ptr++] = nums2[k];
                            flag = true;
                            break;
                        }
                    }    
                    
                    if(!flag) result[ptr++] = -1;
                }
            }
        }
        return result;
    }
}