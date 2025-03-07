class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        if(nums.length == 2) return nums[0] > nums[1] ? 0 : 1;
        if(nums.length > 2 && nums[0] > nums[1]) return 0; // Check first number.
        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1; // Check last number.

        // Check all numbers in between.
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }

        // If list is invalid.
        return -1;
    }
}
