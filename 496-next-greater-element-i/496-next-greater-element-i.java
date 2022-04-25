class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return optimal1(nums1, nums2);
    }
    
    public int[] optimal1(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num)
                hm.put(st.pop(), num);
            st.push(num);
        }
        
        for(int i=0; i<nums1.length; i++){
            nums1[i] = hm.getOrDefault(nums1[i], -1);
        }
        
        return nums1;
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