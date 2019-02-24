package arrays;
/**
 * Adapted from "Introduction to Software Testing", by Ammann and Offutt,
 * chapter 1 (pages 12 and 16)
 * 
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos
 * @version $Id: ArrayOperations.java 253 2016-02-20 15:31:46Z vv $
 */
public class ArrayOperations {

	/**
	 * The number of zeros in an array.
	 * @param x - an integer array
	 * @return The number of occurrences of 0 in x
	 * @exception NullPointerException if x == null
	 */
	public static int numZeros(int[] x) {
		int count = 0;
		// Fault: Array search should start at 0
		// for (int i = 1; i < x.length; i++) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0)
				count++;
		}
		return count;
	}

	/**
	 * Returns the position of the last element equals to y.
	 * @param x - an integer array
	 * @param y - value being searched
	 * @return The last position of y in x, -1 if it does not exist.
	 * @exception NullPointerException if x == null
	 */
	public static int findLast(int[] x, int y) {
		if (x == null)
			throw new NullPointerException();
		// Fault: Array search should end at 0
		// for (int i = x.length - 1; i > 0; i--) {
		for (int i = x.length - 1; i >= 0; i--) {
			if (x[i] == y)
				return i;
		}
		return -1;
	}

	/**
	 * Returns the last occurence of number zero
	 * @param x - an integer array
	 * @return The last occurence of 0 in x, -1 if it does not exist.
	 * @exception NullPointerException if x == null
	 */
	public static int lastZero(int[] x) {
		if (x == null)
			throw new NullPointerException();
		// Fault: Returns the first occurence of 0
		// for (int i = 0; i < x.length; i++) {
		for (int i = x.length - 1; i >= 0; i--)	{
			if (x[i] == 0)
				return i;
		}
		return -1;
	}

	/**
	 * Counts the amount of positive numbers
	 * @param x - an integer array
	 * @return amount of positive numbers
	 * @exception NullPointerException if x == null
	 */
	public static int countPositive(int[] x) {
		if (x == null)
			throw new NullPointerException();
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			// Fault: 0 is not a positive number
			// if (x[i] >= 0)
			if (x[i] > 0)
				count++;
		}
		return count;
	}

	/**
	 * Counts the amount of positive or odd numbers
	 * @param x - an integer array
	 * @return amount of positive or odd numbers
	 * @exception NullPointerException if x == null
	 */
	public static int oddOrPos(int[] x) {
		if (x == null)
			throw new NullPointerException();
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			// Fault: Negative odd numbers
			// if (x[i] % 2 == 1 || x[i] > 0) {
			if (Math.abs(x[i]) % 2 == 1 || x[i] > 0) {
				count++;
			}
		}
		return count;
	}
}
