class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length() != t.length()){
            return false;
        } else {
            for(int i = 0; i < s.length(); i++){
                arr[s.charAt(i) - 'a']++;
            }
            for(int j = 0; j < s.length(); j++){
                arr[t.charAt(j) - 'a']--;
            }
            for(int k : arr){
                if(k != 0) return false;
            }
        }
        return true;
    }
}
