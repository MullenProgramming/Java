class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split("\\s+");
        if(pattern.length() != sArr.length){
            return false;
        } else {
            Map<Character, String> map = new HashMap<>();
            for(int j = 0; j < pattern.length(); j++){
                char c = pattern.charAt(j);
                if(!map.containsKey(c)){
                    if(j < sArr.length && !map.containsValue(sArr[j])){
                        map.put(c, sArr[j]);
                    } else {
                        return false;
                    }
                } else {
                    if(!map.get(c).equals(sArr[j])){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
