class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int count = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1] && count == 1){
                nums[k] = nums[i+1];
                k++;
                count++;
            } else if(nums[i] != nums[i+1]){
                nums[k] = nums[i+1];
                k++;
                count = 1;
            }
        }
        return k;
    }
}
