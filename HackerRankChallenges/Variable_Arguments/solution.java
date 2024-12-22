import java.io.*;
import java.util.*;

class Add {
        
        void add(int... args){
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(int i = 0; i < args.length; i++){
                sb.append(args[i]);
                sum += args[i];
                if(i < args.length-1){
                    sb.append("+");
                }
            }
            sb.append("=");
            System.out.printf("%s%d\n", sb.toString(), sum);
        }
    }

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// We're given 6 integerss in every input, so just read them in.
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();
        
        Add ob = new Add();
        ob.add(n1, n2); // 1+2=3
        ob.add(n1, n2, n3); // 1+2+3=6
        ob.add(n1, n2, n3, n4, n5); // 1+2+3+4=15
        ob.add(n1, n2, n3, n4, n5, n6); // 1+2+3+4+5+6=21
        
        scan.close();
    }
}
