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


//very close to swapping elements in an array in a cycle problem
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null) return null;
        
        if(head.next==null) return head;
        
        //swap the first two and store the headh
        
        ListNode prv=head;
        ListNode cur=head;
        ListNode nxt=cur.next;
        
        cur.next=cur.next.next;
        
        nxt.next=cur;
        head=nxt; //storing head
        
        prv=cur;
        cur=cur.next;
        
    while(cur!=null&&cur.next!=null)  //there are two nodes to swap
    {
        nxt=cur.next;
        cur.next=cur.next.next;
        nxt.next=cur;
        prv.next=nxt;
        prv=cur;
        cur=cur.next;
        
        
	}
	// System.out.println(prv.val);

	return head;

}
}
