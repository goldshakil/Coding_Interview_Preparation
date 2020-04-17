/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode temp = head;
		if (head == null) {
			return null;
		}

		while (temp.next != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
				continue;
			}
			if (temp.next != null)
				temp = temp.next;
		}

		return head;
	}
}
