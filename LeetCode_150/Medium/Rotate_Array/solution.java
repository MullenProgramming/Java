class Solution {
    public void rotate(int[] nums, int k) {
        // If the length is one, just return itself since it can't rotate.
        if(nums.length != 1) {
            int n = nums.length;
            int[] temp = new int[k];

            // If k is > nums.length, it will wrap around back to the start.
            // So for example, if nums.length = 10 and k = 105, we're rotating
            // the array 100 times more than necessary, so we jsut need to rotate
            // it 5 times total.
            k = k % n;

            // Given an example[1,2,3,4,5,6,7] where k = 3 and nums.length = 7.
            // Copy elements from "nums" array from index "n-k" into "temp" array
            // starting from index "0" with "k" elements to be copied over.
            System.arraycopy(nums,n-k,temp,0,k);

            // So temp = [5,6,7].
            // Now, copy elements from "nums" array from index "0" into "nums" array
            // starting from index "k" with "n-k" elements to be copied over.
            System.arraycopy(nums,0,nums,k,n-k);

            // So nums = [1,2,3,1,2,3,4].
            // Finally, copy elements from "temp" array from index "0" into "nums" array
            // starting from index "0" with "k" elements to be copied over.
            System.arraycopy(temp,0,nums,0,k);

            // So nums is now = [5,6,7,1,2,3,4].
        }
    }
}
