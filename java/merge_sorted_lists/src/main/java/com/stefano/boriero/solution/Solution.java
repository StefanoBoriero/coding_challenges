package com.stefano.boriero.solution;

import com.stefano.boriero.common.ListNode;

public class Solution {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode mergedList = null;
		var currentNode1 = list1;
		var currentNode2 = list2;
                var completed = currentNode1 == null && currentNode2 == null;

		while(!completed) {
			var value1 = getValue(currentNode1);
			var value2 = getValue(currentNode2);

			if (value1 < value2) {
				mergedList = append(mergedList, value1);
				currentNode1 = currentNode1.next;
			}
			else {
				mergedList = append(mergedList, value2);
				currentNode2 = currentNode2.next;
			}

			completed = currentNode1 == null && currentNode2 == null;
		}
		return mergedList;
	}

	private int getValue(ListNode node) {
		// 51 is over the range of input values [0,50]
		return node != null ? node.val : 51;
	}

	private ListNode append(ListNode head, int value) {
		var node = new ListNode(value);
		var currentNode = head;
		if (currentNode == null) {
			return node;
		} 
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = node;
		
		return head;
	}
}
