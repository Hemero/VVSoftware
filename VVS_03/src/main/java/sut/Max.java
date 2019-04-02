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
 * @version $Id: Max.java 284 2016-03-05 22:12:09Z vv $
 */
public class Max {
	public static int max(int[] v) {
		if (v == null || v.length == 0)
			throw new IllegalArgumentException("invalid argument");
		int max = v[0];
		int n = v.length;
		for (int i = 1; i < n; i++) {
			if (v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}
}
