import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.reflect.*;

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
