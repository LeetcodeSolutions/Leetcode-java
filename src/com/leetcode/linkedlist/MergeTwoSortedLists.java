package com.leetcode.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
  		if (l1 == null && l2 == null)
			return null;
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		ListNode curt = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				curt.next = l1;
				l1 = l1.next;
			} else {
				curt.next = l2;
				l2 = l2.next;
			}
			curt = curt.next;
		}

		if (l1 != null) {
			curt.next = l1;
		}
		if (l2 != null) {
			curt.next = l2;
		}

		return dummy.next;      
    }
}
