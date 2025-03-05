// Fastest solution:
//
// class Solution {
//     public int singleNumber(int[] nums) {
//         int result = 0;
//         for(int num : nums){
//             result ^= num;
//         }
//         return result;
//     }
// }
//
// EXPLANATION:
// Bitwise XOR (^): This operation compares each bit of two numbers and returns 1 if the bits are different,
// and 0 if they are the same.
// In the loop: The code iterates through each number in the array nums and applies the XOR operation 
// to accumulate a result in ans.


// My first solution:
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        // If no value has 1;
        return -1;
    }
}
