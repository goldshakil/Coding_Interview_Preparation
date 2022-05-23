#LC-206
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

def reversing_func(prv,cur,nxt):
        if nxt:
            # don't loose the next node
            temp_next=nxt.next

            # update links
            cur.next=prv
            nxt.next=cur
            
            # move one step
            return reversing_func(cur,nxt,temp_next) 
                
            
        return cur # head


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        # O(N) solution O(N) space: traverse and out in a list then traverse the list the opposite way, update the next, return the last item in the list
        
        # O(N) solution O(1) space:
        
        if head is None or head.next is None: # 0 or 1 node
            return head
        
        
        # 2 or more nodes
        prv=None
        cur=head
        nxt=cur.next
        
        # iterative solution - O(1) space
        while nxt:
            # don't loose the next node
            temp_next=nxt.next
            
            # update links
            cur.next=prv
            nxt.next=cur
            
            # move one step
            prv,cur,nxt=cur,nxt,temp_next

        # recursive solution - Call stack takes O(N) space
        # cur=reversing_func(prv,cur,nxt)
            
        return cur
            
        
        
