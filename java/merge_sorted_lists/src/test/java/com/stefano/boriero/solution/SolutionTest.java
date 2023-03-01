package com.stefano.boriero.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stefano.boriero.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
	@Test
	void testWithPopulatedLists() {
		var list1 = new ListNode(4);
		list1 = new ListNode(2, list1);
		list1 = new ListNode(1, list1);

		var list2 = new ListNode(4);
		list2 = new ListNode(3, list2);
		list2 = new ListNode(1, list2);
		
		var expectedList = new ListNode(4);
		expectedList = new ListNode(4, expectedList);
		expectedList = new ListNode(4, expectedList);
		expectedList = new ListNode(3, expectedList);
		expectedList = new ListNode(2, expectedList);
		expectedList = new ListNode(1, expectedList);
		expectedList = new ListNode(1, expectedList);

		var solution = new Solution();
		var result = solution.mergeTwoLists(list1, list2);

		assertEquals(expectedList, result);
	}

	@Test
	void testWithBothEmptyLists() {

		ListNode list1 = null; 
		ListNode list2 = null;
		ListNode expectedList = null;
		
		var solution = new Solution();
		var result = solution.mergeTwoLists(list1, list2);

		assertEquals(expectedList, result);
	}

	@Test
	void testWithOneEmptyLists() {

		ListNode list1 = new ListNode(0); 
		ListNode list2 = null;
		ListNode expectedList = new ListNode(0);
		
		var solution = new Solution();
		var result = solution.mergeTwoLists(list1, list2);

		assertEquals(expectedList, result);
	}
}
