class Solution {
    public int jump(int[] nums) {
        int currentPosition = 0;
        int index = 0;
        int maxRange = nums.length-1;
        int minJumps = 0;
        while(currentPosition < nums.length-1){
            if(currentPosition + nums[currentPosition] >= nums.length-1){
                minJumps++;
                break;
            }
            for(int i = 1; i <= nums[currentPosition]; i++){
                if((nums.length-1) - (currentPosition + i + nums[currentPosition + i]) <= maxRange){
                    maxRange = (nums.length-1) - (currentPosition + i + nums[currentPosition + i]);
                    index = i;
                }
            }
            currentPosition += index;
            minJumps++;
        }
        return minJumps;
    }
}
