class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
          // Make sure the key doesn't already exist.
            if(!map.containsKey(s.charAt(i))){
              // make sure the value isn't already mapped to another key.
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i), t.charAt(i));
                } else {
                  // if invalid, map to a char that won't be in the string.
                    map.put(s.charAt(i), '#');
                }
            }
        }
        for(int j = 0; j < s.length(); j++){
            str.append(map.get(s.charAt(j)));
        }
        return str.toString().equals(t) ? true : false;
    }
}
