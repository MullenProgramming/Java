import java.io.*;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

// Fr=or this algorithm, Java 8 must be used if using the DatatypeConverter().

public class Solution {
    private static String hashString(String s){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest = md.digest();
            String hash = DatatypeConverter.printHexBinary(digest);
            return hash.toLowerCase();
        } catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        System.out.println(hashString(s));

        br.close();
    }
}
