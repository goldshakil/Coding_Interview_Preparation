#LC-234
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

def reverse_linkedList(node):
    prv=None
    cur=node
    nxt=cur.next
    while nxt:
        temp_next=nxt.next
        cur.next=prv
        nxt.next=cur
        
        prv,cur=cur,nxt
        nxt=temp_next
    return cur
    
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # O(N) time , O(N) space solution: iterate, append to a list, compare the reverse and the list
        
        
        # O(N) time, O(1) space : Key idea: compare first half to the second half
        
        # Step1: find length + find seperation by actually counting nodes
        # Step1 (SMARTER WAY): find mid point by using 2 ptrs
        
        fast = slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            
        # Step2: reverse the second part
        second_head=reverse_linkedList(slow)
        
        
        # Step3: compare elements until half
        while head and second_head:
            if head.val!=second_head.val:
                return False
            head=head.next
            second_head=second_head.next
        
        return True
        
        
        
        
