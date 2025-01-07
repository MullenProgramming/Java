import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"; // Explanation at the bottom.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        
        for(int i = 0; i < n; i++){
            String username = br.readLine().trim();
            matcher = pattern.matcher(username);
            if(matcher.matches()){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        br.close();
    }
}
/**
Explanation of: "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"
^
    This is the start-of-line anchor. It ensures the match begins at the start of the string.
[a-zA-Z]
    This defines the first character of the string. It must be a single alphabetic character (either uppercase or lowercase, from a-z or A-Z).
[a-zA-Z0-9_]
    This defines the characters that can appear after the first character. It includes:
        Alphabetic characters (a-z, A-Z)
        Numeric digits (0-9)
        The underscore character (_)
{7,29}
    This specifies that the preceding character class ([a-zA-Z0-9_]) must appear at least 7 times and at most 29 times.
    This means the entire string (including the first character) must be between 8 and 30 characters long:
        1 alphabetic character (from [a-zA-Z]) at the start
        7 to 29 characters (from [a-zA-Z0-9_]) following it
$
    This is the end-of-line anchor. It ensures the match ends at the end of the string.
*/
