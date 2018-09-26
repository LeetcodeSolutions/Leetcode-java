package com.leetcode.linkedlist;

public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		int lenA = getListLength(headA);
		int lenB = getListLength(headB);
		while (lenA > lenB) {
			headA = headA.next;
			lenA--;
		}
		while (lenB > lenA) {
			headB = headB.next;
			lenB--;
		}

		while (headA != null && headB != null) {
			if (headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	private int getListLength(ListNode head) {
		int result = 0;
		while (head != null) {
			head = head.next;
			result++;
		}
		return result;
	}
}
