package sut;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos
 * @version $Id: Palindrome.java 275 2016-02-28 22:59:09Z vv $
 */
public class Palindrome {

	/**
	 * Check if a given string is a palindrome.
	 * <p>
	 * A palindrome is a string that is the same when read right-to-left. For
	 * instance <code>"abba"</code> is a palindrome.
	 * </p>
	 * 
	 * @param s
	 *            input string
	 * @return true iff the input string is a pangram
	 * @throws NullPointerException
	 *             if input string is null <br/>
	 */
	public static boolean isPalindrome(String s) {
		if (s == null) {
			throw new NullPointerException();
		}
		int left = 0;
		int right = s.length() - 1;
		boolean result = true;
		while (left < right && result == true) {
			if (s.charAt(left) != s.charAt(right)) {
				result = false;
			}
			left++;
			right--;
		}
		
		return true;
	}
}
