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
 * @version $Id: Exercise5.java 275 2016-02-28 22:59:09Z vv $
 */
public class Exercise5 {
	
	public static int f1(int n) {
		if (n % 4 == 0)
			return f2(n / 3, n);
		else
			return f3(n);
	}

	private static int f2(int a, int b) {
		if (a == 0)
			return f3(b);
		else
			return f4(a);
	}

	private static int f3(int n) {
		if (n == 0)
			return 1;
		else
			return n * f3(n - 1);
	}

	private static int f4(int n) {
		return n * n + 1;
	}
}
