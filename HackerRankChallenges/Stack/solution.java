import java.util.*;

public class Solution {
    
    // Method used to check if the open and closing brackets match.
    // This ensures that strings like "({)}" return false.
    private static boolean matches(char open, char close){
        return (open == '(' && close == ')') || 
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
  
    private static boolean checkStack(String s){
        Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                    stack.push(s.charAt(i));
                } else {
                    if(stack.empty()){
                        return false; // If the stack is empty and starts with a closing bracket, returns false.
                    } else if(!matches(stack.pop(), c)){
                        return false; // If the open and closing brackets don't match, returns false.
                    } 
                    // else {
                    //     stack.pop(); // If all good, pop the stack.
                    // }
                    // I removed the above since stack.pop() was called in the previous IF statement.
                    // Was previously stack.peek().
                }
            }
            return stack.empty() ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String s = scan.next();
            System.out.println(checkStack(s) ? "true" : "false");
        }
        scan.close();
    }
}
