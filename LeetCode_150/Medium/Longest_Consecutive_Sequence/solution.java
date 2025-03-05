class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);

        int longest = 1;
        int temp = 1;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] == nums[j-1]+1){
                temp++;
                if(temp > longest) longest = temp;
            } else if(nums[j] == nums[j-1]){
                // Do nothing since same number.
            } else {
                temp = 1;
            }
        }
        return longest;
    }
}
