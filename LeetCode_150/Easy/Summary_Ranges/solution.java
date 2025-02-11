class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 1){
            result.add(String.valueOf(nums[0]));
            return result;
        }
        int index = 0;
        int start = 0;
        while(index < nums.length-1){
            start = nums[index];
            for(int i = index; i < nums.length-1; i++){
                int previous = nums[i];
                if(i+1 == nums.length-1){
                    if(nums[i+1] != previous+1){
                        if(start != nums[i]){
                            result.add(String.valueOf(start) + "->" + String.valueOf(nums[i]));
                        } else {
                            result.add(String.valueOf(start)); 
                        }
                        result.add(String.valueOf(nums[nums.length-1]));
                        index = i;
                        break;
                    } else {
                        result.add(String.valueOf(start) + "->" + String.valueOf(nums[i+1]));
                        index = i;
                        break;
                    }
                } else if(nums[index+1] != start+1){
                    result.add(String.valueOf(start));
                    break;
                } else if(nums[i+1] != previous+1){
                    result.add(String.valueOf(start) + "->" + String.valueOf(nums[i]));
                    index = i;
                    break;
                }
            }
            index++;
        }
        return result;
    }
}
