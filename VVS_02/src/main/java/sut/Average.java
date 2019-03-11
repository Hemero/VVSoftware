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
 * @version $Id: Average.java 275 2016-02-28 22:59:09Z vv $
 */
public class Average {
	/**
	 * Calculates the average of all elements in an integer array.
	 * 
	 * @param v
	 *            Array of values.
	 * @return The average of all values in v.
	 * @throws IllegalArgumentException
	 *             if v is null or has length 0
	 */
	public static int average(int[] v) {
		if (v == null || v.length == 0)
			throw new IllegalArgumentException();
		int r = 0;
		for (int i = 0; i < v.length; i++) {
			r = r + v[i];
		}
		r = r / v.length;
		return r;
	}
}
