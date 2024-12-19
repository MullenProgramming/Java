import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		while(testCases>0){
			String pattern = scan.nextLine();
          	try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
                testCases--;
            } catch(Exception e){
                System.out.println("Invalid");
                testCases--;
            }
		}
        scan.close();
	}
}



