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
 * @version $Id: Light.java 278 2016-02-29 17:03:01Z vv $
 */
public enum Light {
	/**
	 * Assume all durations are positive.
	 */
	RED(30), YELLOW(5), GREEN(30);

	public int duration() {
		return duration;
	}

	private int duration;

	private Light(int duration) {
		this.duration = duration;
	}
}
