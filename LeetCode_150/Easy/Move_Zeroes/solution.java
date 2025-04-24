class Solution {
    public void moveZeroes(int[] nums) {
        // Count the zeroes:
        int zeroes = 0;
        for(int num : nums){
            if(num == 0) {
                zeroes += 1;
            }
        }
        // Take out the non-zero integers and store them in their own array:
        int[] arr = new int[nums.length-zeroes];
        int pointer = 0;
        for(int k = 0; k < nums.length; k++){
            if(nums[k] != 0){
                arr[pointer] = nums[k];
                pointer++;
            }
        }
        // Set all the non-zero values at the front of the array in the same order: 
        for(int i = 0; i < nums.length; i++){
            if(pointer > 0){
                nums[i] = arr[i];
                pointer--;
            } else {
                nums[i] = 0;
            }
        }
    }
}
