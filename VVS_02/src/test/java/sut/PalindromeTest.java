package sut;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static sut.Palindrome.isPalindrome;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos, João Neto (JUnit 5 conversion)
 * @version $Id: PalindromeTest.java 276 2016-02-28 23:14:26Z vv $
 */
public class PalindromeTest {

	// Two infeasible requirements: [5,6,7,3,5] and [6,7,3,5,6]

	@Test
	public final void testWithNullArgument() {
		// [0,1]
		assertThrows(NullPointerException.class, () -> {
			isPalindrome(null);
	    });
	}

	@Test
	public final void testWithEmptyString() {
		// [0,2,3,4]
		String s = "";
		assertTrue(isPalindrome(s), "empty string not a palindrome?");
	}

	@Test
	public final void testWithLen2StringAA() {
		// [0,2,3,5,7]
		// [3,5,7,3]
		// [5,7,3,4]
		String s = "aa";
		assertTrue(isPalindrome(s), "aa not a palindrome?");
	}

	@Test
	public final void testWithLen2StringAB() {
		// [0,2,3,5,6,7]
		// [5,6,7,3,4]
		// [3,5,6,7,3]
		String s = "ab";
		assertFalse(isPalindrome(s), "ab is a palindrome?");
	}

	@Test
	public final void testWithLen2StringABCA() {
		// [5,7,3,5]
		// [7,3,5,6,7]
		String s = "abca";
		assertFalse(isPalindrome(s), "abca is a palindrome?");
	}
	
	@Test
	public final void testWithLen2StringABA() {
		// [5,7,3,5]
		// [7,3,5,6,7]
		String s = "aba";
		assertTrue(isPalindrome(s), "abca is a palindrome?");
	}

	@Test
	public final void testWithLen2StringABBA() {
		// [7,3,5,7]
		String s = "abba";
		assertTrue(isPalindrome(s), "abba is a palindrome?");
	}
}
