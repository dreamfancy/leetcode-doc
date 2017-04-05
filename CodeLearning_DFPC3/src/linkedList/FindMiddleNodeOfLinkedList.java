package linkedList;

public class FindMiddleNodeOfLinkedList {
	
	public ListNode findm(ListNode head)
	{
		if(head==null ||head.next==null) return head;
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		//if(fast.next!=null) slow = slow.next;
		
		return slow;
	}
	
	//Another solution :add dummy node. see lecture 4: 28:30
	
	
}
