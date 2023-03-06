package com.stefano.boriero.destinationcity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {
	@Test
	void testCities() {
		List<List<String>> input = List.of(List.of("London", "New York"), List.of("New York", "Lima"), List.of("Lima", "Sao Paulo"));
		String expectedOutcome = "Sao Paulo";

		Solution solution = new Solution();
		String outcome = solution.destCity(input);
		assertEquals(expectedOutcome, outcome);
	}

	@Test
	void testLetters() {
		List<List<String>> input = List.of(List.of("B", "C"), List.of("D", "B"), List.of("C", "A"));
		String expectedOutcome = "A";

		Solution solution = new Solution();
		String outcome = solution.destCity(input);
		assertEquals(expectedOutcome, outcome);
	}

	@Test
	void testSinglePath() {
		List<List<String>> input = List.of(List.of("A", "Z"));
		String expectedOutcome = "Z";

		Solution solution = new Solution();
		String outcome = solution.destCity(input);
		assertEquals(expectedOutcome, outcome);
	}
}
