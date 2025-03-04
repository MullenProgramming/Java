// Sliding window
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            return nums[0] >= target ? 1 : 0;
        }
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            while(sum >= target){
                if(i - left + 1 < minLen){
                    minLen = i - left + 1;
                }
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
