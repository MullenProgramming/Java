import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        HashSet<String> pairs = new HashSet<>();
      
        for(int i = 0; i < t; i++){
            String newPair = br.readLine();
            pairs.add(newPair);
            System.out.println(pairs.size());
        }
        br.close();
    }
}
