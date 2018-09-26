package com.leetcode.linkedlist;

public class SortList {
	 public ListNode sortList(ListNode head) {
	 		if (head == null || head.next == null)
				return head;
			ListNode prev = null;
			ListNode fast = head, slow = head;
			while (fast != null && fast.next != null) {
				prev = slow;
				slow = slow.next;
				fast = fast.next.next;
			}
			prev.next = null;
			ListNode l1 = sortList(head);
			ListNode l2 = sortList(slow);
			return merge(l1, l2);      
	    }
	    
		public ListNode merge(ListNode l1, ListNode l2) {
			ListNode dummy = new ListNode(Integer.MIN_VALUE);
			ListNode current = dummy;
			while (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					current.next = l1;
					l1 = l1.next;
				} else {
					current.next = l2;
					l2 = l2.next;
				}
				current = current.next;
			}
			if (l1 != null) {
				current.next = l1;
			}
			if (l2 != null) {
				current.next = l2;
			}
			return dummy.next;
		}
}
