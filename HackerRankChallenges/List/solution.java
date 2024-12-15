import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
    // Read in N, L (arr), and Q.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> arr = new LinkedList<>(
            Stream.of(br.readLine().trim().split("\\s+"))
            .map(Integer::valueOf)
            .collect(toList())
        );
        int q = Integer.parseInt(br.readLine().trim());
        
    // Loop through the rest of the input queries and perform instructions.
        for(int i = 0; i < q; i++){
            String query = br.readLine().trim(); // Read "Insert" or "Delete"
            String[] queryValues = br.readLine().trim().split("\\s+"); // Takes in values as [x, y] or [index].
            if(query.equals("Insert")){
                int x = Integer.parseInt(queryValues[0]);
                int y = Integer.parseInt(queryValues[1]);
                arr.add(x, y);
            } else {
                int index = Integer.parseInt(queryValues[0]);
                arr.remove(index);
            }
        }
        // Print the array.
        for(int element : arr){
            System.out.printf("%d ", element);
        }
        br.close();
    }
}
