import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt).collect(Collectors.toList()); //example: [1, -2, 4, -5, 1]
      
        int negativeArrays = 0;
        for(int i = 0; i < n; i++){
            int tempSum = 0;
            for(int j = i; j < n; j++){
                tempSum += arr.get(j);
                if(tempSum < 0) negativeArrays++;
            }
        }
        System.out.printf("%d", negativeArrays);
    }
}
