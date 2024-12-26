import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    // Perform solution (canWin has been modified from original directions, fix would just be a helper function instead).
    public static boolean canWin(int idx, boolean[] visited, int leap, List<Integer> game){
        // Lose conditions (break statements).
        if(idx < 0 || game.get(idx) == 1 || visited[idx]){
            return false;
        }
        // Win conditions.
        if(idx == game.size()-1 || idx+leap >= game.size()){
            return true;   
        }
        // Mark current index position as visited.
        visited[idx] = true;
        
        // Iterate through all possible movements.
        return canWin(idx+leap, visited, leap, game) ||
                canWin(idx+1, visited, leap, game) ||
                canWin(idx-1, visited, leap, game);
    }
    // Read in inputs, then call canWin function.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine()); // Number of games.
        while(q-- > 0){
            String[] q2 = br.readLine().trim().split("\\s+"); // "n" and "leap".
            int leap = Integer.parseInt(q2[1]);
            List<Integer> game = new ArrayList<Integer>(
                Stream.of(br.readLine().trim().split("\\s+"))
                .map(Integer::valueOf)
                .collect(toList())
            );
            System.out.println(canWin(0, new boolean[game.size()], leap, game) ? "YES" : "NO");
        }
    }
}
