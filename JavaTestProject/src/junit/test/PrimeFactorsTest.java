package junit.test;

import junit.first.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.*;

import org.junit.Test;



public class PrimeFactorsTest {

	PrimeFactors pf = new PrimeFactors();
	
	@Test
	public void testFactorsOf() 
	{
		assertThat(pf.factorsOf(1), empty());
		/*assertThat(pf.factorsOf(1), empty());
		assertThat(pf.factorsOf(2), contains(2));
	    assertThat(pf.factorsOf(3), contains(3));
	    assertThat(pf.factorsOf(4), contains(2,2));
	    assertThat(pf.factorsOf(5), contains(5));
	    assertThat(pf.factorsOf(6), contains(2, 3));
	    assertThat(pf.factorsOf(7), contains(7));
	    assertThat(pf.factorsOf(8), contains(2,2,2));
	    assertThat(pf.factorsOf(9), contains(3,3));
	    assertThat(pf.factorsOf(2*2*3*3*5*7*11*11*13), 
	    		contains(2,2,3,3,5,7,11,11,13));*/
	}

}
