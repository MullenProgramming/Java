class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabetArr = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            alphabetArr[magazine.charAt(i) - 'a']++;
        }
        for(int j = 0; j < ransomNote.length(); j++){
            alphabetArr[ransomNote.charAt(j) - 'a']--;
        }
        for(int k = 0; k < alphabetArr.length; k++){
            if(alphabetArr[k] < 0) return false;
        }
        return true;
    }
}
