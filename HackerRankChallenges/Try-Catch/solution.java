import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch(ArithmeticException e){
            System.out.println(e);
        } catch(Exception e){
            System.out.println(e.getClass().getName());
        }
        scan.close();
    }
}
