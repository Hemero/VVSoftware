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
 * @version $Id: TestArrayOperationsFindLast.java 253 2016-02-20 15:31:46Z vv $
 */
public class TestArrayOperationsFindLast {

	@Test
	public void testWithNullArgument() {
		int[] x = null;
		int y = 0;
	    assertThrows(NullPointerException.class, () -> {
	    	ArrayOperations.findLast(x, y);
	    });
		
	}

	@Test // should fail!
	public void testElementAtPosition0() {
		int y = 1;
		int[] x = { y, y + 1, y + 2 };
		int idx = ArrayOperations.findLast(x, y);
		assertEquals(0, idx, "first index");
	}

	@Test
	public void testElementAtTheEnd() {
		int y = 1;
		int[] x = { y, y + 2, y, y + 1, y };
		int idx = ArrayOperations.findLast(x, y);
		assertEquals(4, idx, "last index");
	}

	@Test
	public void testElementAtMiddle() {
		int y = 1;
		int[] x = { y + 2, y, y + 1 };
		int idx = ArrayOperations.findLast(x, y);
		assertEquals(1, idx, "middle index");
	}
}
