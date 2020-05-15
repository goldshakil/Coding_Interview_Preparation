/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
	public ListNode removeElements(ListNode head, int val) {

        
        //edge cases (0,1,2) nodes
		if (head == null)
			return null;
		else if (head.next == null && head.val == val)
			return null;
		else if (head.next == null && head.val != val)
			return head;

		else if (head.next.next == null && head.val == val && head.next.val == val)
			return null; // first match
		else if (head.next.next == null && head.next.val == val) // second match
		{
			head.next = null;
			return head;
		} else if (head.next.next == null && head.val == val) {
			return head.next;
		}

		// general case
		ListNode prv = head;
		ListNode cur = head.next;

		// not the first element
		while (cur != null) {
			while (cur != null && cur.val == val) // keep removing if there are any copies
			{
				prv.next = prv.next.next;
				cur = cur.next;

			}
			if (cur != null)
				cur = cur.next;
			prv = prv.next;
		}

		// remove the beginning copied values

		while (head != null && head.val == val) // keep the copies at the beginneing
		{
			head = head.next;
		}

		return head;
	}
}
