class Solution {
    public boolean matches(char left, char right){
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }

    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : brackets){
            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                } else {
                    char left = stack.pop();
                    if(!matches(left, c)){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
