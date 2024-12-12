import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        
// ******************* MY INPUT STARTS HERE *****************
        BigInteger big = new BigInteger(n);
        if(big.isProbablePrime(1)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
// **********************************************************                 
        bufferedReader.close();
    }
}
