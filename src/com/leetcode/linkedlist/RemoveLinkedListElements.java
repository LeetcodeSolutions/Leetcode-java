package com.leetcode.linkedlist;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeElements(ListNode head, int val) {
    	if(head == null)
    		return null;
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null){
        	if(current.next.val == val){
        		current.next = current.next.next;
        	}
        	current = current.next;
        }
        return dummy.next;
    }

}
