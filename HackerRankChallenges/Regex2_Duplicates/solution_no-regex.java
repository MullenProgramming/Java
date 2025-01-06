import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < n; i++){
            String[] line = br.readLine().trim().split("\\s+");
            HashSet<String> dict = new HashSet<>();
            StringBuilder str = new StringBuilder();
            for(String s : line){
                if(!dict.contains(s.toLowerCase())){
                    str.append(s).append(" ");
                    dict.add(s.toLowerCase());
                }
            }
            System.out.println(str.toString().trim());
        }
        br.close();
    }
}
