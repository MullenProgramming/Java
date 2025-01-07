import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex {
    String pattern = "^(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)$";
}

// I used a regex generator for the regex pattern. I admit I would not be able to solve this on my own without that tool.
