class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(-1);
        ListNode new_node=null;
		ListNode head = node; // head
		int carry = 0;

        //add the same position numbers
		while (l1 != null && l2 != null) {
			if (l1.val + l2.val + carry > 9) {
				node.val = l1.val + l2.val + carry - 10;
				carry = 1;
			} else {
				node.val = l1.val + l2.val + carry;
				carry = 0;
			}
			new_node = new ListNode(-1);
			node.next = new_node;
			node = node.next;
			l1 = l1.next;
			l2 = l2.next;

		}

        //if one has extra numbers
		while (l1 != null) {
			if (l1.val + carry > 9) {
				node.val = l1.val + carry - 10;
				carry = 1;
			} else {
				node.val = l1.val + carry;
				carry = 0;
			}
			new_node = new ListNode(-1);
			node.next = new_node;
			node = node.next;
			l1 = l1.next;
		}
        //if two has extra numbers
		while (l2 != null) {
			if (l2.val + carry > 9) {
				node.val = l2.val + carry - 10;
				carry = 1;
			} else {
				node.val = l2.val + carry;
				carry = 0;
			}
			new_node = new ListNode(-1);
			node.next = new_node;
			node = node.next;
			l2 = l2.next;
		}
        
        // if still there is a carry
		if (carry == 1) {
			node.val = carry;
			new_node = new ListNode(-1);
			node.next = new_node;
			node = node.next;
		}

		// remove the last added node
		ListNode temp = head;
		int c = 0;
		while (temp.next.val >= 0) {
			temp = temp.next;
		}
		temp.next = null;

		return head;
	}
}
