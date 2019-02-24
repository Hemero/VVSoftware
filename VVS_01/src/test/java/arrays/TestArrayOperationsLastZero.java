package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestArrayOperationsLastZero {

	@Test
	public void testWithNullArgument() {
		int[] x = null;
	    assertThrows(NullPointerException.class, () -> {
	    	ArrayOperations.lastZero(x);
	    });
	}
	
	@Test
	public void testWithEmptyArguments() {
		int[] x = { };	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, -1, "index of zero");
	}
	
	@Test
	public void testWithOneArgumentNoZero() {
		int y = 0;
		int[] x = {y-1};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, -1, "index of zero");
	}
	
	@Test
	public void testWithOneArgumentWithZero() {
		int y = 0;
		int[] x = {y};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 0, "index of zero");
	}
	
	@Test
	public void testWithTwoZeroOnly() {
		int y = 0;
		int[] x = {y, y};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 1, "index of zero");
	}
	
	@Test
	public void testWithNoZero() {
		int y = 0;
		int[] x = {y-3, y-2, y-1, y+1, y+2, y+3};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, -1, "index of zero");
	}
	
	@Test
	public void testWithZeroMiddle() {
		int y = 0;
		int[] x = {y-3, y-2, y-1, y, y+1, y+2, y+3};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 3, "index of zero");
	}
	
	@Test
	public void testWithZeroEnd() {
		int y = 0;
		int[] x = {y-3, y-2, y-1, y+1, y+2, y+3, y};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 6, "index of zero");
	}
	
	@Test
	public void testWithZeroBeginning() {
		int y = 0;
		int[] x = {y, y-3, y-2, y-1, y+1, y+2, y+3};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 0, "index of zero");
	}
	
	@Test
	public void testWithTwoZeroBeginEnd() {
		int y = 0;
		int[] x = {y, y-3, y-2, y-1, y+1, y+2, y+3, y};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 7, "index of zero");
	}
	
	@Test
	public void testWithTwoZero() {
		int y = 0;
		int[] x = {y-3, y, y-2, y-1, y+1, y+2, y, y+3};	
		int result = ArrayOperations.lastZero(x);
		assertEquals(result, 6, "index of zero");
	}
}
