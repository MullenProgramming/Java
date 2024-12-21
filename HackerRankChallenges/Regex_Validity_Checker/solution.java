import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
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
