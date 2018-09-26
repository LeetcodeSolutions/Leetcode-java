package com.leetcode.linkedlist;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
      ListNode oddHead = new ListNode(Integer.MIN_VALUE);
      ListNode odd = oddHead;
      ListNode evenHead = new ListNode(Integer.MIN_VALUE);
      ListNode even = evenHead;
      
      int count = 0;
      while(head != null){
    	  if(count % 2 == 0){
    		  odd.next = head;
    		  head = head.next;
    		  odd = odd.next;
    		  odd.next = null;
    	  }else{
    		  even.next = head;
    		  head = head.next;
    		  even = even.next;
    		  even.next = null;
    	  }
    	  count++;
      }
      odd.next = evenHead.next;
      return oddHead.next;     
    }

}
