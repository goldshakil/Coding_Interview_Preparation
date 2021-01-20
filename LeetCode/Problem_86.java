/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
       if (head == null)
			return null;

		ListNode temp = head;
		List<ListNode> listLeft = new ArrayList<ListNode>();
		List<ListNode> listRight = new ArrayList<ListNode>();

		while (temp != null) {
//				System.out.println(temp.val);
			if (temp.val < x)
				listLeft.add(temp);
			else
				listRight.add(temp);
			temp = temp.next;

		}

		if (listLeft.size() == 0)
			return listRight.get(0);
		else if (listRight.size() == 0)
			return listLeft.get(0);
		else {
			// neither are zero
			ListNode newHead = new ListNode(listLeft.get(0).val);

			ListNode tempHead = newHead;
			for (int i = 1; i < listLeft.size(); i++) {

				ListNode child = new ListNode(listLeft.get(i).val);
				newHead.next = child;
				newHead = newHead.next;
			}

			for (int i = 0; i < listRight.size(); i++) {
				ListNode child = new ListNode(listRight.get(i).val);
				newHead.next = child;
				newHead = newHead.next;
			}

			return tempHead;
        }
        
    }
}
