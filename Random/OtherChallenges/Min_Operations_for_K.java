/**
* CHALLENGE:
* Given an array, nums=[1], and an integer k,
* Find the minimum number of operations necessary to 
* be greater than or equal to k.
* You can either duplicate an element in nums, or increment 
* it by 1.
* EXAMPLE: 
* INPUT: int[] nums = [1], k = 15.
* OUTPUT: 6
* EXPLANATION: We increment nums FOUR times to get 5
* (nums[0] = nums[0] +1 +1 +1 +1 --> nums[0] = 5).
* Then we duplicate nums twice (nums = [5] --> [5, 5] --> [5, 5, 5].
* So 4 increments plus 2 duplications gives us 5+5+5 = k = 15, so 
* 6 operations in total.
*/

public class Solution {

  public static int minOperations(int k){
    int numOperations = Integer.MAX_VALUE;
    for(int i = 1; i <= k; i++){
      
      // First we find the number of increments to go from 1 to i.
      int increments = i-1;
      
      // Second we get the number of duplicates so that the sum >= k.
      // Each duplication adds i to the sum. So the amount of duplicates needed
      // to reach k is i * (duplicates + 1).
      // Use basic algebra to find num duplicates we have: 
      // i * (dups + 1) >= k -----> dups >= (k/i) - 1
      int duplicates = (int) Math.ceil((double) k/i) -1;

      // Add both and check if it's the minimum.
      int totalOps = increments + duplicates;

      if(totalOps < numOperations){
        numOperations = totalOps;
      }
    }
    return numOperations;
  }
}
