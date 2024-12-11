import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverseA = new StringBuilder().append(A).reverse().toString();
        System.out.println(A.compareTo(reverseA) == 0 ? "Yes" : "No");
    }
}



