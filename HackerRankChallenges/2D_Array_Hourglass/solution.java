import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Read in and create 2D array as a list.
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        // We know the dimensions and constraints, so we can just
        // hard code the values to solve.
        int largestSum = -100;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int tempSum = 0;
                tempSum += arr.get(i).get(j);
                tempSum += arr.get(i).get(j+1);
                tempSum += arr.get(i).get(j+2);
                tempSum += arr.get(i+1).get(j+1);
                tempSum += arr.get(i+2).get(j);
                tempSum += arr.get(i+2).get(j+1);
                tempSum += arr.get(i+2).get(j+2);
                if(tempSum > largestSum){
                    largestSum = tempSum;
                }
            }
        }
        System.out.println(largestSum);
        bufferedReader.close();
    }
}
