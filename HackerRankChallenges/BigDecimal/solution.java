import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) throws IOException {
    // Read in and set up variables and values.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

    // Sort the array per the directions.
        Arrays.sort(s, new Comparator<String>() {
            public int compare(String a, String b) {
                BigDecimal b1 = new BigDecimal(a);
                BigDecimal b2 = new BigDecimal(b);
                
            // Descending order = b2 c-> b1, ascending order = b1 c-> b2.
                int result = b2.compareTo(b1);
                
            // If the values are equal (0.12 compared to .12), 
            // then returning 1 maintains the order inputs are read.
                if (result == 0) {
                    return 1;
                }
                return result;
            }
        });
        
    // Prints the sorted array
        for (String value : s) {
            System.out.println(value);
        }
    }
}
