class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int[] n = new int[l1+l2];
        int index = 0, i = 0, j = 0;
        while(index < n.length){
            if(i >= l1){
                n[index++] = nums2[j++];
            }else if(j >= l2){
                n[index++] = nums1[i++];
            }else if(nums1[i] <= nums2[j]){
                n[index++] = nums1[i++];
            }else{
                n[index++] = nums2[j++];
            }
        }
        if(n.length % 2 == 1){
            return (double) n[n.length / 2];
        }else{
            double a = (double) n[n.length / 2];
            double b = (double) n[n.length / 2 - 1];
            return (a + b) / 2;
        }
    }
}