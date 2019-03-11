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
 * @version $Id: Pangram.java 275 2016-02-28 22:59:09Z vv $
 */
public class Pangram {

	/**
	 * Mask constant corresponding to all letters set.
	 */
	private static final int ALL_LETTERS_SEEN = 0x3FFFFFF;

	/**
	 * Test if given sequence of characters is a pangram, i.e., contains all
	 * characters from 'a' to 'z'.
	 * <p>
	 * For instance <code>"the quick brown fox jumps over the lazy dog"</code>
	 * is a pangram. And <code>"abcdefghijklmnopqrstuvwxyz"</code> is also a
	 * pangram of course.
	 * </p>
	 * The method is case insensitive.
	 * 
	 * @param s
	 *            String to test.
	 * @return true is s is a pangram
	 * @throws NullPointerException
	 *             if v is null
	 * @throws IllegalArgumentException
	 *             if v contains characters different from 'a' to 'z'
	 */
	public static boolean pangram(String s) {
		if (s == null) {
			throw new NullPointerException();
		}

		int mask = 0; // bit mask, one bit per letter
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char c = Character.toLowerCase(s.charAt(i));
			if (c >= 'a' && c <= 'z')
				mask = mask | (1 << (c - 'a')); // set bit for c
			else if (c != ' ')
				// Not a letter and not a space
				throw new IllegalArgumentException("invalid character: " + c);
		}
		return mask == ALL_LETTERS_SEEN;
	}
}
