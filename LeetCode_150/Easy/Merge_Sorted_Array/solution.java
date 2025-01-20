// Runtime = O(m + n)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // pointers for each array
        int M = m-1; 
        int N = n-1;
        int k = m+n-1;

        // handle this like merge sort
        while(M >= 0 && N >= 0){
            if(nums1[M] > nums2[N]){
                nums1[k] = nums1[M];
                M--;
            } else {
                nums1[k] = nums2[N];
                N--;
            }
            k--;
        }

        while(N >= 0){
            nums1[k] = nums2[N];
            N--;
            k--;
        }
    }
}
