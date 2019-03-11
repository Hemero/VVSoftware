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
 * @version $Id: Isogram.java 275 2016-02-28 22:59:09Z vv $
 */
public class Isogram {

	/**
	 * Check if a given string is an isogram.
	 *
	 * An isogram is a string with no repeated letters.
	 *
	 * For example <code>"code"</code> is an isogram but <code>"program"</code>
	 * is not, since the latter contains two occurrences of <code>'r'</code>.
	 * 
	 * @param s
	 *            input string
	 * @return true iff input string is an isogram
	 * @throws NullPointerException
	 *             if input argument is null
	 * @throws IllegalArgumentException
	 *             if input string is invalid
	 */
	public static boolean isogram(String s) {
		if (s == null)
			throw new IllegalArgumentException("null argument");

		boolean result = true;
		int mask = 0; // bit mask, one bit per letter (int has 32 bits > 26 letters)
		int n = s.length();

		for (int i = 0; i < n; i++) {
			char c = Character.toLowerCase(s.charAt(i));
			if (c >= 'a' && c <= 'z') {
				// lower case letter
				int cBit = (1 << (c - 'a'));
				if ((cBit & mask) != 0) {
					// repeated letter (bit already set)
					result = false;
				}
				// set bit for letter c
				mask = mask | cBit;
			} else if (c != ' ') {
				throw new IllegalArgumentException("invalid character: " + c);
			}
		}
		return result;
	}
}
