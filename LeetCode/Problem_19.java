/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {

        
        //edge cases:
		if (head == null) //empty
			return null;
		if (head.next == null)
			return null; // one node and n is valid
		if (head.next.next == null && n == 1) // 2 nodes and remove the last one
		{
			head.next = null;
			return head;
		} else if (head.next.next == null && n == 2) // 2 nodes and removing the first one
		{

			return head.next;
		}
        
        
        //find the length
		ListNode temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		if (size == n) {
			return head.next;
		}
        
        
        //find the node right before the one to be removed
		int counter = 0;
		temp = head;
		while (counter < size - n - 1) {
			counter++;
			temp = temp.next;
		}
        //if the last one to be remove just set the 
		if (n == 1) {
			temp.next = null;
		} else {
			temp.next = temp.next.next;
		}

		return head;

	}
}
