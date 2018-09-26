package com.leetcode.linkedlist;

public class ReorderList {
	public void reorderList(ListNode head) {
		if(head == null || head.next == null)
			return;
		ListNode middle = getMiddle(head);
		ListNode tail = reverse(middle.next);
		middle.next = null;
		merge(head, tail);
	}

	public void merge(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		int index = 0;
		while (l1 != null && l2 != null) {
			if (index % 2 == 0) {
				dummy.next = l1;
				l1 = l1.next;
			} else {
				dummy.next = l2;
				l2 = l2.next;
			}
			dummy = dummy.next;
			index++;
		}
		if (l1 != null) {
			dummy.next = l1;
		}
		if (l2 != null) {
			dummy.next = l2;
		}
	}

	public ListNode getMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public ListNode reverse(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
		}
		return newHead;
	}
}
