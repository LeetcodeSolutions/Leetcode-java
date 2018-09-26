package com.leetcode.linkedlist;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      	if(head == null || head.next == null)
    		return null;
    	int len = getListLength(head);
    	if(len == n)
    		return head.next;
    	int index = len - n - 1;
    	ListNode current = head;
    	while(index > 0){
    		current = current.next;
    		index--;
    	}
    	
    	current.next = current.next.next;
    	return head;      
    }
    
        public int getListLength(ListNode head){
    	int len = 0;
    	while(head != null){
    		len++;
    		head = head.next;
    	}
    	return len;
    }
}
