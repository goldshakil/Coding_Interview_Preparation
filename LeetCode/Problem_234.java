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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        if(head.next==null) return true;
        
        // Memory: O(1) solution: reverse one half of the linked list and then put two pointer   (half and beginning)
        //for odd number of nodes just desregard the middle value
      //easy solutioon : use a a string builder and reverse it
        
        int counter=0;
        ListNode temp=head;
        while(temp!=null)
        {
            counter++;
            temp=temp.next;
        }
   
        int limit=counter/2;
        int c=0;
        temp=head;
        while(c<limit)
        {
            c++;
            temp=temp.next;
        }
        if(counter%2!=0)
        {
            temp=temp.next;
        }
        
        //temp is the head of the second half
        //reverse the second half
        ListNode prv=null;
        ListNode cur=temp;
        ListNode nxt;
        while(cur!=null)
        {
            nxt=cur.next;
            cur.next=prv;
            prv=cur;
            
            cur=nxt;
            
        }
        temp=head;
        while(temp!=null&&prv!=null)
        {
            if(prv.val!=temp.val) return false;
            temp=temp.next;
            prv=prv.next;
        }
        
        return true;
    }
}
