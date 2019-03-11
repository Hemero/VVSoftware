package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestArrayOperationsCountPositive1 {

	@Test
	public void testWithNullArgument() {
		
		int[] x = null;
		assertThrows(NullPointerException.class, () -> {
			ArrayOperations.countPositive(x);
		});
	}
	
	@Test
	public void testWithEmptyArray() {
		int[] x = {};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 0, "count of positives");
	}
	
	@Test
	public void testWithNoZerosNoNegatives() {
		int[] x = {1, 2, 3};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 3, "count of positives");
	}
	
	@Test
	public void testWithZerosNoNegatives() {
		int[] x = {0, 1, 2, 3};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 3, "count of positives");
	}
	
	@Test
	public void testWithNoZerosWithNegatives() {
		int[] x = {-1, 1, -2, 2, -3};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 2, "count of positives");
	}
	
	@Test
	public void testWithZerosWithNegatives() {
		int[] x = {0, 1, -1, -2, -7, 3, 7, 8};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 4, "count of positives");
	}
	
	@Test
	public void testWithNoPositivesWithZeros() {
		int[] x = {-1, 0, -2, -3};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 0, "count of positives");
	}
	
	@Test
	public void testWithNoPositivesNoZeros() {
		int[] x = {-1, -2, -3};	
		int result = ArrayOperations.countPositive(x);
		assertEquals(result, 0, "count of positives");
	}
}
