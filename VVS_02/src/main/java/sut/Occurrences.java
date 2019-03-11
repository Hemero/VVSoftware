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
 * @version $Id: Occurrences.java 275 2016-02-28 22:59:09Z vv $
 */
public class Occurrences {

	/**
	 * Calculate number of occurrences of a character in an array of characters.
	 * 
	 * @param v
	 *            Array of characters.
	 * @param c
	 *            Character to count.
	 * @return Number of occurrences of c in v.
	 * @throws NullPointException
	 *             if given array is null.
	 */
	public static int occurrences(char[] v, char c) {
		if (v == null)
			throw new NullPointerException();
		int n = 0;
		for (int i = 0; i < v.length; i++)
			if (v[i] == c)
				n++;
		return n;
	}
}
