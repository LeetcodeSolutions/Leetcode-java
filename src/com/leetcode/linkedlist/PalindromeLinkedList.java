package com.leetcode.linkedlist;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isPalindrome(ListNode head) {
     	if(head == null || head.next == null)
    		return true;
    	
    	ListNode slow = head;
    	ListNode fast = head.next;
    	
    	while(fast != null && fast.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	
    	ListNode middle = slow.next;
        slow.next = null;
        
        ListNode prev = null;
        
        ListNode current = middle;
        
        while(current.next != null){
        	ListNode tmp = current.next;
        	current.next = prev;
        	prev = current;
        	current = tmp;
        }
        current.next = prev;
    	
        while(current != null){
        	if(current.val != head.val)
        		return false;
        	current = current.next;
        	head = head.next;
        }
    	
        return true;       
    }

}
