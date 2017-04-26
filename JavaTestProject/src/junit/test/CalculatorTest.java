package junit.test;

import junit.first.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testAdd() {
		assertEquals(5, new Calculator().add(2, 3));
		assertEquals(5, new Calculator().add(3, 2));
	}

	@Test
	public void testSub() {
		assertEquals(4, new Calculator().sub(6, 2));
	}

}
