import java.io.*;
import java.util.*;
import java.util.stream.*;

public class MyCalculator {
    
    public static long power(int n, int p) throws Exception {
        if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        } else if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        } else {
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs;
        while((inputs = br.readLine()) != null){
            String[] inputArr = inputs.trim().split("\\s+");
            int n = Integer.parseInt(inputArr[0]);
            int p = Integer.parseInt(inputArr[1]);
            try{
                System.out.println(power(n, p));
            } catch(Exception e){
                System.out.println(e);
            }
        }
        br.close();
    }
}
