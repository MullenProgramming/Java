class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length < 2) return Arrays.asList(Arrays.asList(strs));
        List<List<String>> arr = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            List<String> tempArr;

            if(map.containsKey(str)){
                tempArr = map.get(str);
            } else {
                tempArr = new ArrayList<>();
            }
            tempArr.add(s);
            map.put(str, tempArr);
        }

        for(String key : map.keySet()){
            arr.add(map.get(key));
        }
        
        return arr;
    }
}
