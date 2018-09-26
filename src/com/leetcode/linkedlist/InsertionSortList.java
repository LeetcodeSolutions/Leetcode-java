package com.leetcode.linkedlist;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
     ListNode prev = dummy;
     ListNode current = head;
     
     while(current != null){
     	prev = dummy;
     	while(prev.next != null && prev.next.val < current.val){
     		prev = prev.next;
     	}
     	ListNode next = current.next;
     	current.next = prev.next;
     	prev.next = current;
     	current = next;
     }
     return dummy.next;     
 }

}
