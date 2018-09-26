package com.leetcode.twopoints;

import com.leetcode.linkedlist.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
 		if (head == null || head.next == null)
			return head;
		ListNode dummy1 = new ListNode(0);
		ListNode dummy2 = new ListNode(0);
		ListNode less = dummy1;
		ListNode great = dummy2;

		ListNode node = head;

		while (node != null) {
			ListNode next = node.next;
			if (node.val < x) {
				less.next = node;
				less = less.next;
				less.next = null;
			} else {
				great.next = node;
				great = great.next;
				great.next = null;
			}
			node = next;
		}
		less.next = dummy2.next;
		return dummy1.next;       
    }
}
