class Solution {
    public int thirdMax(int[] nums) {
      // I was too lazy to use a comparator.
      // Basically the idea is to sort the array in reverse order
      // and only with distinct values.
      //
      // Not my best work, but wwas feeling too lazy lol
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[nums.length];
        int j = 0;
        for(int i = nums.length-1; i >= 0; i--){
            arr[j] = nums[i];
            j++;
            set.add(nums[i]);
        }

      // Finds the 3rd distinct value or overall max.
        int overallMax = arr[0];
        int thirdDistinctMax = Integer.MIN_VALUE;
        int count = 1;
        int prevNum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != prevNum){
                count++;
            }
            prevNum = arr[i];
            if(count == 3){
                thirdDistinctMax = arr[i];
            }
            if(nums[i] > overallMax){
                overallMax = arr[i];
            }
        }
        return set.size() > 2 ? thirdDistinctMax : overallMax;
    }
}
