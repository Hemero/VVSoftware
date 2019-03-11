package sut;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static sut.Occurrences.occurrences;


/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos, João Neto (JUnit 5 conversion)
 * @version $Id: OccurrencesTest.java 276 2016-02-28 23:14:26Z vv $
 */
public class OccurrencesTest {

	@Test
	public final void testWithNullArgument() {
		char[] v = null;
		char c = 'a';
		assertThrows(NullPointerException.class, () -> {
			occurrences(v, c);
	    });
		
	}

	@Test
	public final void testWithEmptyArray() {
		char[] v = {};
		char c = 'a';
		int n = occurrences(v, c);
		assertEquals(0, n, "0 occ in {}");
	}

	@Test
	public final void test1stPositionLen1() {
		char[] v = {'a'};
		char c = 'a';
		int n = occurrences(v, c);
		assertEquals(1, n, "1 occ. in length-1 array");
	}

	@Test
	public final void test1stPositionLen2() {
		char[] v = {'a', 'x'};
		char c = 'a';
		int n = occurrences(v, c);
		assertEquals(1, n, "1 occ. in length-1 array");
	}

	@Test
	public final void test2ndPositionLen2() {
		char[] v = {'x', 'a'};
		char c = 'a';
		int n = occurrences(v, c);
		assertEquals(1, n, "1 occ. in length-1 array");
	}

	@Test
	public final void test1stAnd2ndPositionLen2() {
		char[] v = {'a', 'a'};
		char c = 'a';
		int n = occurrences(v, c);
		assertEquals(2, n, "2 occ. in length-2 array");
	}
}
