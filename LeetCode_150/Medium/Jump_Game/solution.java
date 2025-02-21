// Most efficient solution:

class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i; 
            }
        }
        return goal == 0;
    }
}
// --------------------------------------------------------------------------
// First, inefficient solution:

// class Solution {
//     public boolean canJump(int[] nums) {
//         if(nums.length == 1) return true;
//         if(nums[0] == 0) return false;
//         List<Integer> zeroIndexMap = new ArrayList<>();

//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 0){
//                 zeroIndexMap.add(i);
//             }
//         }

//         if(zeroIndexMap.isEmpty()) return true;
//         int count = zeroIndexMap.size();
//         int index = 0;
//         int j = zeroIndexMap.get(index)-1;
//         int maxJump = nums[j];

//         while(count > 0){
//             if(maxJump > zeroIndexMap.get(index) - j){
//                 count--;
//                 index++;
//                 if(count != 0){
//                     j = zeroIndexMap.get(index)-1;
//                     maxJump = nums[j];
//                 }
//             } else if(maxJump == zeroIndexMap.get(index) - j && zeroIndexMap.get(index) == nums.length-1){
//                 return true;
//             } else if(j == 0){
//                 return false;
//             } else {
//                 j--;
//                 maxJump = nums[j];
//             }
//         }
//         return true;
//     }
// }
