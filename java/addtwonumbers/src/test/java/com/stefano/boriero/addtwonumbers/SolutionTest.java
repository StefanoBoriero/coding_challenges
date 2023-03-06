package com.stefano.boriero.addtwonumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.stefano.boriero.common.ListNode;

public class SolutionTest {
	@Test
	void testMidCarryOver() {
		ListNode l1 = new ListNode(3);
		l1 = new ListNode(4, l1);
		l1 = new ListNode(2, l1);

		ListNode l2 = new ListNode(4);
		l2 = new ListNode(6, l2);
		l2 = new ListNode(5, l2);
		
		ListNode expectedResult = new ListNode(8);
		expectedResult = new ListNode(0, expectedResult);
		expectedResult = new ListNode(7, expectedResult);

		Solution solution = new Solution();
		assertEquals(expectedResult, solution.addTwoNumbers(l1, l2));
	}

	@Test
	void testDifferentLenghtListsWithFinalCarryOver() {
		ListNode l1 = new ListNode(9);
		l1 = new ListNode(9, l1);
		l1 = new ListNode(9, l1);
		l1 = new ListNode(9, l1);
		l1 = new ListNode(9, l1);
		l1 = new ListNode(9, l1);
		l1 = new ListNode(9, l1);

		ListNode l2 = new ListNode(9);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		l2 = new ListNode(9, l2);
		
		ListNode expectedResult = new ListNode(1);
		expectedResult = new ListNode(0, expectedResult);
		expectedResult = new ListNode(0, expectedResult);
		expectedResult = new ListNode(0, expectedResult);
		expectedResult = new ListNode(9, expectedResult);
		expectedResult = new ListNode(9, expectedResult);
		expectedResult = new ListNode(9, expectedResult);
		expectedResult = new ListNode(8, expectedResult);

		Solution solution = new Solution();
		assertEquals(expectedResult, solution.addTwoNumbers(l1, l2));
	}

	@Test
	void testSumZeroes() {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode expectedResult = new ListNode(0);

		Solution solution = new Solution();
		assertEquals(expectedResult, solution.addTwoNumbers(l1, l2));
	}
}
