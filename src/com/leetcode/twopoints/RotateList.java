package com.leetcode.twopoints;

import com.leetcode.linkedlist.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
        	return head;
        int size = getListSize(head);
        k = k % size;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = head;
        for(int i = 0; i < k; i++){
        	head = head.next;
        }
        
        while(head.next != null){
        	head = head.next;
        	tail = tail.next;
        }
        head.next = dummy.next;
        dummy.next = tail.next;
        tail.next = null;
        return dummy.next;
    }
    
    public int getListSize(ListNode head){
    	int count = 0;
    	while(head != null)
    	{
    		head = head.next;
    		count++;
    	}
    	return count;
    }
}
