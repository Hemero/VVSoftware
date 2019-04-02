package sut;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static sut.Max.max;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos, João Neto (JUnit 5 conversion)
 * @version $Id: MaxTest.java 284 2016-03-05 22:12:09Z vv $
 */
public class MaxTest {

	/** test case t1; see slides */
	@Test
	public void testWithTwoElementArray() {
		int[] v = { 1, 2 };
		assertEquals(2, max(v), "maximum");
	}

	/** test case t2; see slides */
	@Test
	public void testIllegalArgumentFailure() {
		assertThrows(IllegalArgumentException.class, () -> {
			max(null);
	    });
	}

	/** test case t3; see slides */
	@Test
	public void testWithFourElementArray() {
		int[] v = { 1, 0, 2, 3 };
		assertEquals(3, max(v), "maximum");
	}

	/** test case t4; see slides */
	@Test
	public void testWithOneElementArray() {
		int[] v = { 1 };
		assertEquals(1, max(v), "maximum");
	}

	/** test case t5; see slides */
	@Test
	public void testWithMaxAtStart() {
		int[] v = { 1, 0, 0 };
		assertEquals( 1, max(v), "maximum");
	}
}
