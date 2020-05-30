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
    public ListNode rotateRight(ListNode head, int k) {
        
        int counter=0;
        ListNode newHead;
        ListNode prvHead=head;
        
        if(k==0) return head;
        
        if(head==null) return null;
        
        if(head.next==null) return head;
        
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        
       // System.out.println(length);
        
        int newTimes=k%length;  //optimization (looping more than length means repetition)
        while(counter<newTimes)
        {
          
            ListNode tail=prvHead;
            
            
            while(tail.next.next!=null)
            {
                tail=tail.next;
            
            }
            newHead=tail.next;
            
            tail.next=null;
            newHead.next=prvHead;
            prvHead=newHead;
            counter++;
           
        }
        
        return prvHead;
    }
}
