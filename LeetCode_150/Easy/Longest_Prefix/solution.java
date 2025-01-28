class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        StringBuilder prefix = new StringBuilder();
        int index = 0;
        for(String s : strs){
            if(s.length() < minLength){
                minLength = s.length();
            }
        }
        while(index < minLength){
            boolean same = true;
            char compare = strs[0].charAt(index);
            for(int i = 0; i < strs.length; i++){
                if(strs[i].charAt(index) != compare){
                    same = false;
                }
            }
            if(same){
                prefix.append(strs[0].charAt(index));
            } else {
                break;
            }
            index++;
        }
        return prefix.toString().length() > 0 ? prefix.toString() : "";
    }
}
