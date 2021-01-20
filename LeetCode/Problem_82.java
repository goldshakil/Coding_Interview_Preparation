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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null||head.next==null)
            return head;
        
        head = new ListNode(Integer.MAX_VALUE, head); // This solve if the first node is duplicate
        
        ListNode prv=head;
        ListNode cur=head;
        boolean duplicate=false;
        while(cur!=null&&cur.next!=null)
        {
            if(cur.val==cur.next.val)
            {
                cur.next=cur.next.next;
                duplicate=true;
            }
            else if(duplicate)
            {
                prv.next=cur.next;
                cur=cur.next;
                duplicate=false;
            }
            else
            {
                prv=cur;
                cur=cur.next;
                
            }
        }
        
        if(duplicate)
            prv.next=null;
        
        return head.next;
            
        
    }
}
