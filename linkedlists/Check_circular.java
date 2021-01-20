package linkedlists;

import linkedlists.ImplementingLinkedList.Node;

public class Check_circular {

	@SuppressWarnings("rawtypes")
	public boolean check(Node head) {
		Node tortoise = head, hare = head.next;
		
		while(true) {
		
			if(hare == null || hare.next == null)
				return false;
			if(hare == tortoise || hare.next == tortoise)
				return true;
			else {
				tortoise = tortoise.next;
				hare = hare.next.next;
			}
		}
	}
}
