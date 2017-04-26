package junit.first;

//import static org.junit.Assert.*;
//import static org.hamcrest.Matchers.*;


import java.util.*;

public class PrimeFactors {
	
	
	public List<Integer> factorsOf(int n)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		return factors;
		
		/*for(int divisor=2;n>1; divisor++)
		  for(;n%divisor==0;n/=divisor)	
		  	factors.add(divisor);
		
		return factors;*/
	}
	
	/*public static void main(String  args[]) throws Exception
	{
		PrimeFactors p = new PrimeFactors();
		//List<Integer> factors = new ArrayList<Integer>();
		//factors=p.factorsOf(3);
		System.out.println(p.factorsOf(9));
		//assertThat(p.factorsOf(2), contains(2));
	}*/

}
