import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) throws IOException {
// Read in inputs, placing keys/values into map.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < n*2; i+=2){
            String key = br.readLine().trim();
            String value = br.readLine().trim();
            map.put(key, value);
        }
// Loop through queries until EoF.
        String line;
        while((line = br.readLine()) != null){
            if(map.containsKey(line)){
                System.out.printf("%s=%s\n", line, map.get(line));
            } else {
                System.out.println("Not found");
            }
        }
        br.close();
    }
}
