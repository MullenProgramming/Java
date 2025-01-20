import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().trim().split("\\s+");

        BitSet b1 = new BitSet(Integer.parseInt(firstLine[0]));
        BitSet b2 = new BitSet(Integer.parseInt(firstLine[0]));
      // Number of loops of instructions
        int M = Integer.parseInt(firstLine[1]);

      // Probably better to use a switch statement or helper method, but I was feeling lazy.
        for(int i = 0; i < M; i++){
            String[] line = br.readLine().trim().split("\\s+");
            if(line[0].equals("AND")){
                if(Integer.parseInt(line[1]) == 1){
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
            } else if(line[0].equals("OR")){
                if(Integer.parseInt(line[1]) == 1){
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
            } else if(line[0].equals("XOR")){
                if(Integer.parseInt(line[1]) == 1){
                    b1.xor(b2);
                } else {
                    b2.xor(b1);
                }
            } else if(line[0].equals("FLIP")){
                if(Integer.parseInt(line[1]) == 1){
                    b1.flip(Integer.parseInt(line[2]));
                } else {
                    b2.flip(Integer.parseInt(line[2]));
                }
            } else if(line[0].equals("SET")){
                if(Integer.parseInt(line[1]) == 1){
                    b1.set(Integer.parseInt(line[2]));
                } else {
                    b2.set(Integer.parseInt(line[2]));
                }
            }
            System.out.printf("%d %d\n", b1.cardinality(), b2.cardinality());
        }
    }
}
