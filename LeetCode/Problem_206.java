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
    public ListNode reverseList(ListNode head) {
        
        ListNode prv=null;
        ListNode cur=head;
        ListNode nxt;
        
        while(cur!=null)
        {
            nxt=cur.next;
            cur.next=prv;
            prv=cur;
            cur=nxt;
        }
        
        
        return prv;
    }
}
