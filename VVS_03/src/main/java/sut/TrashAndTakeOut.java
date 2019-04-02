package sut;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering University of Lisbon Faculty of
 * Sciences Department of Informatics
 * 
 * From "Introduction to Software Testing", by P. Ammann and J. Offutt Chapter
 * 2, section 2.4, page 74
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos
 * @version $Id: TrashAndTakeOut.java 284 2016-03-05 22:12:09Z vv $
 */
class trashAndTakeOut {
	public static void trash(int x) {
		int m, n;
		m = 0;
		if (x > 0)
			m = 4;
		if (x > 5)
			n = 3 * m;
		else
			n = 4 * m;
		int o = takeOut(m, n);
		System.out.println("o is: " + o);
	}

	public static int takeOut(int a, int b) {
		int d, e;
		d = 42 * a;
		if (a > 0)
			e = 2 * b + d;
		else
			e = b + d;
		return (e);
	}

	/**
	 * Driver method for trashAndTakeOut.
	 * Read an integer from standard input, call trashAndTakeOut()
	 */
	public static void main(String[] argv) {
		if (argv.length != 1) {
			System.out.println("Usage: java trashAndTakeOut <integer>");
			return;
		}
		int x = 0;
		try {
			x = Integer.parseInt(argv[0]);
		} catch (NumberFormatException e) {
			System.out.println("Entry must be an integer, using 1.");
			x = 1;
		}
		trash(x);
	}
}