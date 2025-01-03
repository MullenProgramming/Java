import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.reflect.*;

// --- More efficient solution at bottom--- 
// ***************************** MY CODE BELOW *****************************
class Prime {
    public void checkPrime(String... args){
        for(int i = 0; i < args.length; i++){
            BigInteger big = new BigInteger(args[i]);
            if(big.isProbablePrime(1)){
                System.out.printf("%s ", args[i]);
            } 
        }
        System.out.println();
    }
}

public class Solution {
	public static void main(String[] args) {
	    try{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n1 = br.readLine();
		String n2 = br.readLine();
	        String n3 = br.readLine();
	        String n4 = br.readLine();
	        String n5 = br.readLine();
// ************************************************************************  
      
  		Prime ob=new Prime();
  		ob.checkPrime(n1);
  		ob.checkPrime(n1,n2);
  		ob.checkPrime(n1,n2,n3);
  		ob.checkPrime(n1,n2,n3,n4,n5);	
		    
  		Method[] methods=Prime.class.getDeclaredMethods();
  		Set<String> set=new HashSet<>();
  		boolean overload=false;
		    
  		for(int i=0;i<methods.length;i++)
  		{
  			if(set.contains(methods[i].getName()))
  			{
  				overload=true;
  				break;
  			}
  			set.add(methods[i].getName());
  			
  		}
	  		if(overload)
	  		{
	  		    throw new Exception("Overloading not allowed");
	  		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

// Not the most efficient solution, but good if the numbers are very large.
// -----------------------------------------------------------------------------------------------------
// A more efficient solution below (works better with smaller numbers (O(sqrt(n))). Replace Prime class with below:
// NOTE: Not my code.

class Prime {
	public static boolean isPrime(int n){
		if (number <= 1) return false;
		if (number <= 3) return true; // 2 and 3 are prime
		if (number % 2 == 0 || number % 3 == 0) return false;
		
		for (int i = 5; i * i <= number; i += 6) { // Check divisors of the form 6k ± 1
		    if (number % i == 0 || number % (i + 2) == 0) return false;
		}
		return true;
	}
	
	public static void checkPrime(String... args) {
	        for (String arg : args) {
	            int num = Integer.parseInt(arg);
	            if (isPrime(num)) {
	                System.out.printf("%s ", arg);
	            }
	        }
	        System.out.println();
	}
}
