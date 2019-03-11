package sut;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static sut.Light.GREEN;
import static sut.Light.RED;
import static sut.Light.YELLOW;

import sut.Light;
import sut.TrafficLight;

/**
 * Software Verification and Validation
 * 
 * Master of Science in Computer Engineering
 * University of Lisbon
 * Faculty of Sciences
 * Department of Informatics
 * 
 * @author Eduardo Marques, Vasco T. Vasconcelos, João Neto (JUnit 5 conversion)
 * @version $Id: TrafficLightTest.java 275 2016-02-28 22:59:09Z vv $
 */
public class TrafficLightTest {

	@Test
	public void testInitToRed() {
		TrafficLight tl = new TrafficLight(RED);
		assertEquals(RED, tl.getActiveLight(), "light");
		assertEquals(RED.duration(), tl.getTimeLeft(), "time");
	}

	@Test
	public void testInitToGreen() {
		TrafficLight tl = new TrafficLight(GREEN);
		assertEquals(GREEN, tl.getActiveLight(), "light");
		assertEquals(GREEN.duration(), tl.getTimeLeft(), "time");
	}

	@Test
	public void testInitToYellow() {
		TrafficLight tl = new TrafficLight(YELLOW);
		assertEquals(YELLOW, tl.getActiveLight(), "light");
		assertEquals(YELLOW.duration(), tl.getTimeLeft(), "time");
	}

	// BAD TEST: too much verification done
	// BETTER FOCUS ON ONE TRANSITION AT A TIME
	@Test
	public void testRedToGreenToYellow() {
		TrafficLight tl = new TrafficLight(GREEN);
		tl.tick(GREEN.duration());
		Light light0 = tl.getActiveLight();
		int time0 = tl.getTimeLeft();
		tl.tick(YELLOW.duration());
		assertEquals(YELLOW, light0, "light0");
		assertEquals(YELLOW.duration(), time0, "time0");
		assertEquals(RED, tl.getActiveLight(), "light");
		assertEquals(RED.duration(), tl.getTimeLeft(), "time");
	}

	@Test
	public void testRedToGreen() {
		TrafficLight tl = new TrafficLight(RED);
		tl.tick(RED.duration());
		assertEquals(GREEN, tl.getActiveLight(), "light");
		assertEquals(GREEN.duration(), tl.getTimeLeft(), "time");
	}

	@Test
	public void testGreenToYellow() {
		TrafficLight tl = new TrafficLight(GREEN);
		tl.tick(GREEN.duration());
		assertEquals(YELLOW, tl.getActiveLight(), "light");
		assertEquals(YELLOW.duration(), tl.getTimeLeft(), "time");
	}

	@Test
	public void testYellowToRed() {
		TrafficLight tl = new TrafficLight(YELLOW);
		tl.tick(YELLOW.duration());
		assertEquals(RED, tl.getActiveLight(), "light");
		assertEquals(RED.duration(), tl.getTimeLeft(), "time");
	}

	@Test
	public void testStayRed() {
		TrafficLight tl = new TrafficLight(RED);
		tl.tick(RED.duration() - 1);
		assertEquals(RED, tl.getActiveLight(), "light");
		assertEquals(1, tl.getTimeLeft(), "time");
	}

	@Test
	public void testStayGreen() {
		TrafficLight tl = new TrafficLight(GREEN);
		tl.tick(GREEN.duration() - 1);
		assertEquals(GREEN, tl.getActiveLight(), "light");
		assertEquals(1, tl.getTimeLeft(), "time");
	}

	@Test
	public void testStayYellow() {
		TrafficLight tl = new TrafficLight(YELLOW);
		tl.tick(YELLOW.duration() - 1);
		assertEquals(YELLOW, tl.getActiveLight(), "light");
		assertEquals(1, tl.getTimeLeft(), "time");
	}
}
