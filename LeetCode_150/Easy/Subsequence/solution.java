class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(int i = s.length()-1; i >= 0; i--){
            stack.push(s.charAt(i));
        }
        for(int j = 0; j < t.length(); j++){
            if(stack.empty()) return true;
            else if(t.charAt(j) == stack.peek()){
                stack.pop();
            }
        }
        if(stack.empty()){
            return true;
        } else {
            return false;
        }
    }
}
