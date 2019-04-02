package sut;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering University of Lisbon Faculty of
 * Sciences Department of Informatics
 * 
 * Adapted from "Introduction to Software Testing", by P. Ammann and J. Offutt
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos
 * @version $Id: RootFinder.java 284 2016-03-05 22:12:09Z vv $
 */
public class RootFinder {
	private static int a, b, c;
	private static int roots;
	private static double r1, r2;

	public static void main(String[] args) {
		if (args.length == 3) {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
		} else {
			a = 1;
			b = -2;
			c = 1;
		}
		findRoots();
		System.out.printf("%d solutions\n", roots);
		if (roots == 1)
			System.out.printf("x=%f\n", r1);
		else if (roots == 2)
			System.out.printf("x=%f or x=%f\n", r1, r2);
	}

	private static void findRoots() {
		int delta = b * b - 4 * a * c;
		if (delta < 0) {
			roots = 0;
			return;
		}
		double aux1 = -(double) b / (2 * a);
		if (delta == 0) {
			roots = 1;
			r1 = aux1;
		} else {
			double aux2 = Math.sqrt(delta) / (2 * a);
			roots = 2;
			r1 = aux1 - aux2;
			r2 = aux1 + aux2;
		}
	}
}
