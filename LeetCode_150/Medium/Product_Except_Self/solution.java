class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int totalProduct = 1;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                totalProduct *= nums[i];
            } else {
                zeroCount++;
            }
        }
        // If the number of zeroes is more than 1, the entire
        // result array will be zeroes, so just return it.
        if(zeroCount > 1){
            return result;
        }

        for(int j = 0; j < nums.length; j++){
            if(zeroCount == 1){
                if(nums[j] != 0){
                    result[j] = 0;
                } else {
                    result[j] = totalProduct;
                }
            } else {
                result[j] = totalProduct/nums[j];
            }
        }
        return result;
    }
}
