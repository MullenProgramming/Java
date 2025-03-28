class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        // Arrays.sort(nums); // Needed if doing two pointer approach.

        int l = 0;
        while(l < nums.length){
            // This ignores duplicate values we're looking for.
            if (l > 0 && nums[l] == nums[l - 1]) {
                l++;
                continue;
            }

            Map<Integer, Integer> map = new HashMap<>();
            int target = nums[l] * -1;

            for(int i = l+1; i < nums.length; i++){
                int complement = target - nums[i];
                if(map.containsKey(complement)){
                    List<Integer> list = Arrays.asList(nums[l], nums[i], complement);
                    Collections.sort(list);

                    // This returns true if the hashSet doesn't already contain the given list.
                    // This is to prevent duplicates added to the list.
                    // This is quicker than if(!arr.contains(list)){ ......
                    if(seen.add(list)){
                        arr.add(list);
                    }
                } else {
                    map.put(nums[i], i);
                }
            }
            l++;
        }
        return arr;
    }
}
