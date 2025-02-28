class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int compliment = target - numbers[i];
            if(map.containsKey(compliment)){
                int leftIndex = Math.min(i, map.get(compliment));
                int rightIndex = Math.max(i, map.get(compliment));
                return new int[] {leftIndex+1, rightIndex+1};
            } else {
                map.put(numbers[i], i);
            }
        }
        return new int[] {0, 0}; // If no numbers add up to target.
    }
}
