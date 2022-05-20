# LC-160
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        
        # O(N*M) solution for every node in A go through B
        # O(N+M) solution create a hashmap of B and then for for every node in A search the hashmap -> O(N+M) space (Worst case N+M)
        
        # O(N+M) solution O(1) space
        
        tempA=headA
        lenA=0
        while tempA:
            tempA=tempA.next
            lenA+=1

        tempB=headB
        lenB=0
        while tempB:
            tempB=tempB.next
            lenB+=1
        
        if lenA>lenB:
            counter=0
            while headA and counter<(lenA-lenB):
                headA=headA.next
                counter+=1
        elif lenB>lenA:
            counter=0
            while headB and counter<(lenB-lenA):
                headB=headB.next
                counter+=1
        
        # The 2 ptrs should be at the same distance from the intersection
        while headA and headB:
            if headA==headB:
                return headA
            headA=headA.next
            headB=headB.next
            
        return None
        
        
        
