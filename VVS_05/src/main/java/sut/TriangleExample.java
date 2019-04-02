package sut;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering, University of Lisbon, Faculty of
 * Sciences, Department of Informatics
 * 
 * @author Eduardo Marques
 * @version $Id: TriangleExample.java 313 2016-03-21 12:46:58Z vv $
 */
public class TriangleExample {

	enum Type {SCALENE, ISOSCELES, EQUILATERAL}

	/**
	 * @param a The length of one side
	 * @param b The length of another side
	 * @param c The length of the third side
	 * @throws IllegalArgumentException when one of the sides is non-positive
	 * 	or the three sides do not form a triangle
	 */
	public static Type triangleType(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0)
			throw new IllegalArgumentException();
		if (a >= b + c || b >= a + c || c >= a + b)
			throw new IllegalArgumentException();
		int count = 0;
		if (a == b)
			count++;
		if (a == c)
			count++;
		if (b == c)
			count++;
		if (count == 0)
			return Type.SCALENE;
		if (count == 1)
			return Type.ISOSCELES;
		return Type.EQUILATERAL;
	}
}
