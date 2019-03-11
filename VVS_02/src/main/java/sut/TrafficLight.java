package sut;

import static sut.Light.GREEN;
import static sut.Light.RED;
import static sut.Light.YELLOW;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos
 * @version $Id: TrafficLight.java 275 2016-02-28 22:59:09Z vv $
 */
public class TrafficLight {

	private Light light;
	private int time;

	public TrafficLight(Light initialLight) {
		light = initialLight;
		time = light.duration();
	}

	public Light getActiveLight() {
		return light;
	}

	public int getTimeLeft() {
		return time;
	}

	public void tick(int delta) {
		time = time - delta;
		if (time <= 0) {
			switch (light) {
			case RED:
				light = GREEN;
				break;
			case GREEN:
				light = YELLOW;
			case YELLOW:
				light = RED;
				break;
			}
			time = light.duration();
		}
	}
}
