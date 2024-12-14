import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
// Read in each line into a 2D ArrayList (honestly a 2D array could've worked as well.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null) {
                arr.add(
                    Stream.of(line.replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
        };

// Assumes input file is always the same, and that "d" will always be on row n+1.
        int n = arr.get(0).get(0);
        int d = arr.get(n+1).get(0);
        for(int i = 0; i < d; i++){
// Since d is n+1, the queries start at n+2. We loop through each one unti end of the ArrayList.
            int row = arr.get(n+2+i).get(0);
            int col = arr.get(n+2+i).get(1);
            try{
                System.out.println(arr.get(row).get(col));
            } catch(IndexOutOfBoundsException ex){
                System.out.println("ERROR!");
            }
        } 
        br.close();
    }
}
