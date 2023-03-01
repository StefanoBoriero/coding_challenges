package com.stefano.boriero.common;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(){}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof ListNode) {
			var compared = this;
			var comparing = (ListNode)other;
			while(compared != null && comparing != null) {
				if(compared.val != comparing.val) {
					return false;
				}
				compared = compared.next;
				comparing = comparing.next;
			}
			return true;
		} else {
			return false;
		}

	}
}
