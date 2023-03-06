package com.stefano.boriero.addtwonumbers;

import com.stefano.boriero.common.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode lastNodeResult = null;

		int carry_over = 0;
		while(!complete(l1, l2)) {
		    int value1 = getValue(l1);
			int value2 = getValue(l2);

			int sum = value1 + value2 + carry_over;
			int unit = sum % 10;

			ListNode nodeResult = new ListNode(unit);
			carry_over = sum / 10;
			if (result == null) {
				result = nodeResult;
				lastNodeResult = nodeResult;
			} else {
				lastNodeResult.next = nodeResult;
				lastNodeResult = lastNodeResult.next;
			}

			l1 = advance(l1);
			l2 = advance(l2);
		}

		if (carry_over > 0) {
		    lastNodeResult.next = new ListNode(carry_over);
		}

		return result;
	}

	private ListNode advance(ListNode listNode) {
		return listNode == null ? listNode : listNode.next;
	}

	private int getValue(ListNode node) {
		return node == null ? 0 : node.val;
	}

	private boolean complete(ListNode l1, ListNode l2) {
		return complete(l1) && complete(l2);
	}

	private boolean complete(ListNode listNode) {
		return listNode == null;
	}
}
