package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestArrayOperationsOddOrPos {
	
	@Test
	public void testWithNullArgument() {
		int[] x = null;
	    assertThrows(NullPointerException.class, () -> {
	    	ArrayOperations.oddOrPos(x);
	    });
	}
	
	@Test
	public void testWithEmptyArguments() {
		int[] x = { };	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 0, "amount of odd or pos");
	}
	
	@Test
	public void testWithOneArgumentNoOdds() {
		int y = 0;
		int[] x = {y};	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 0, "index of zero");
	}
	
	@Test
	public void testWithOneArgumentWithPositiveOdd() {
		int y = 0;
		int[] x = {y+1};	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 1, "index of zero");
	}

	@Test
	public void testWithOneArgumentWithNegativeOdd() {
		int y = 0;
		int[] x = {y-1};	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 1, "index of zero");
	}
	
	@Test
	public void testWithOneArgumentWithPositiveEven() {
		int y = 0;
		int[] x = {y+2};	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 1, "index of zero");
	}
	
	@Test
	public void testWithOneArgumentWithNegativeEven() {
		int y = 0;
		int[] x = {y-2};	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 0, "index of zero");
	}
	
	@Test
	public void testWithMixedPositiveNegativeOdds() {
		int y = 0;
		int[] x = {y-2, y-1, y, y+1, y+2};	
		int result = ArrayOperations.oddOrPos(x);
		assertEquals(result, 3, "index of zero");
	}
}
