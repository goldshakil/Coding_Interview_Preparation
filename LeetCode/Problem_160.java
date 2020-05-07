/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int getLength(ListNode a)
    {
        int i=0;
        while(a!=null)
        {
            i++;
            a=a.next;
        }
        
        return i;
    }
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

	// Make copies of heads;
      int length_a=getLength(headA);
      int length_b=getLength(headB);
      
      //make them the same length
      if(length_a>length_b)
      {
          for(int i=0;i<length_a-length_b;i++)
          {
              headA=headA.next;
          }
          
          
      }
       if(length_b>length_a)
      {
          for(int i=0;i<length_b-length_a;i++)
          {
              headB=headB.next;
          }
          
          
      }
      while(headA!=null&&headB!=null)
      {
          if(headA==headB) return headB;
          headA=headA.next;
          headB=headB.next;
      }
      

	

	return null;

}
}
