#LC-21
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        # O(N+M) time and O(1) space
        if list1 is None:
            return list2
        if list2 is None:
            return list1
        
        dummy=ListNode(0) # Ptr to keep track of head
        sortedNode=dummy # Ptr to add nodes
            
        while list1 and list2:
            if list1.val<list2.val:
                sortedNode.next=list1
                list1=list1.next  
            else:
                sortedNode.next=list2
                list2=list2.next 
            sortedNode=sortedNode.next
            
        # no need to iterate here you can easily set sortedNode.next=list1 or list2
        while list1:
            sortedNode.next=list1
            list1=list1.next
            sortedNode=sortedNode.next

        while list2:
            sortedNode.next=list2
            list2=list2.next
            sortedNode=sortedNode.next
        
        return dummy.next
            
        
