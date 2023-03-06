package com.stefano.boriero.threesum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {
	@Test
	void test() {
		Solution solution = new Solution();
		int[] nums = {-1, 0, 1, 2, -1, -4};

		List<Integer> triplet1 = List.of(-1, -1, 2);
		List<Integer> triplet2 = List.of(-1, 0, 1);
		List<List<Integer>> expectedOutcome = List.of(triplet1, triplet2);

		var outcome = solution.threeSum(nums);
		assertEquals(expectedOutcome, outcome);
	}

	@Test
	void testNoResult() {
		Solution solution = new Solution();
		int[] nums = {0, 1, 1};

		List<List<Integer>> expectedOutcome =  Collections.emptyList(); 

		var outcome = solution.threeSum(nums);
		assertEquals(expectedOutcome, outcome);
	}
	
	@Test
	void testAllZeroes() {
		Solution solution = new Solution();
		int[] nums = {0, 0, 0};

		List<Integer> triplet1 = List.of(0, 0, 0);
		List<List<Integer>> expectedOutcome =  List.of(triplet1);

		var outcome = solution.threeSum(nums);
		assertEquals(expectedOutcome, outcome);
	}

	@Test
	void testFourZeroes() {
		Solution solution = new Solution();
		int[] nums = {0, 0, 0, 0};

		List<Integer> triplet1 = List.of(0, 0, 0);
		List<List<Integer>> expectedOutcome =  List.of(triplet1);

		var outcome = solution.threeSum(nums);
		assertEquals(expectedOutcome, outcome);
	}

	@Test
	void testFirstMatch() {
		Solution solution = new Solution();
		int[] nums = {1, -1, -1, 0};

		List<Integer> triplet1 = List.of(-1, 0, 1);
		List<List<Integer>> expectedOutcome =  List.of(triplet1);

		var outcome = solution.threeSum(nums);
		assertEquals(expectedOutcome, outcome);
	}
}
