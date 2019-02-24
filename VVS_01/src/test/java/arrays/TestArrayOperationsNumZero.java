package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos, João Neto (JUnit 5 conversion)
 * @version $Id: TestArrayOperationsNumZero.java 253 2016-02-20 15:31:46Z vv $
 */
public class TestArrayOperationsNumZero {

	@Test
	public void testWithNullArgument() {
		int[] x = null;
	    assertThrows(NullPointerException.class, () -> {
	    	ArrayOperations.numZeros(x);
	      });
	}

	@Test
	public void testWithEmptyArray() {
		int x[] = {};
		int n = ArrayOperations.numZeros(x);
		assertEquals(0, n, "count of zeros");
	}

	@Test
	public void testWithArrayWithoutZeros() {
		int[] x = {1, 2};
		int n = ArrayOperations.numZeros(x);
		assertEquals(0, n, "count of zeros");
	}

	@Test // Should fail!!
	public void testWithArrayFilledWithZeros() {
		int[] x = {0, 0};
		int n = ArrayOperations.numZeros(x);
		assertEquals(2, n, "count of zeros");
	}

	@Test
	public void testWithArrayContainingOneZero() {
		int[] x = {1, 1, 0};
		int n = ArrayOperations.numZeros(x);
		assertEquals(1, n, "count of zeros");
	}
}
