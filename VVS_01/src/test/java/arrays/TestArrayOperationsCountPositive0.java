package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestArrayOperationsCountPositive0 {

	@Test
	public void testWithNullArgument() {
		
		int[] x = null;
		
		assertThrows(NullPointerException.class, () -> {
			ArrayOperations.countPositive(x);
		});
	}
	
	@ParameterizedTest(name = "argument: {0}, expected: {1}")
	@MethodSource("testCasesOneOrLessElements")
	public void testWithOneOrLessElementArray(int[] x, int expected) {
		assertEquals(ArrayOperations.countPositive(x), expected);
	}

	@ParameterizedTest(name = "argument: {0}, expected: {1}")
	@MethodSource("testCasesMultiplesElements")
	public void testWithMultipleElementArray(int[] x, int expected) {
		assertEquals(ArrayOperations.countPositive(x), expected);
	}
	
	@Parameters
	static Stream<Arguments> testCasesOneOrLessElements() {
		return Stream.of(Arguments.of(new int[]{ }, 0),
				Arguments.of(new int[]{-1}, 0),
				Arguments.of(new int[]{1}, 1),
				Arguments.of(new int[]{0}, 0));
	}
	
	@Parameters
	static Stream<Arguments> testCasesMultiplesElements() {
		return Stream.of(Arguments.of(new int[]{0, 1, 2, 3}, 3),
				Arguments.of(new int[]{-1, -2, -3, -5, -2}, 0),
				Arguments.of(new int[]{1, -2, 3, -8, -2, 1}, 3),
				Arguments.of(new int[]{-2, -1, 0, 1, 2, -3}, 2));
	}
}
