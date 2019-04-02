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
 * @version $Id: BinarySearch.java 284 2016-03-05 22:12:09Z vv $
 */
public class BinarySearch {

	public static int bSearch(int[] array, int value) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (array[middle] == value)
				return middle;
			if (array[middle] < value)
				left = middle + 1;
			else
				right = middle - 1;
		}
		return -1;
	}
}
