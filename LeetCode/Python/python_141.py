#LC-121
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # O(N) solution O(N) memory
#         visited = {} // or use set
#         node=head
#         node = head
#         flag = False
#         while node: #check whatever you wanna get the next for -> so you don't do .next on a None element
#             if visited.get(node):
#                 flag = True
#                 break
#             visited[node] = 1
#             node = node.next            
#         return flag

        # O(N) solution, O(1) space Floyd's cycle detection algorithm (Tortoise and Hare) 
        slow_ptr = head
        fast_ptr = head
        while fast_ptr and fast_ptr.next: #fast_ptr will reach the end first so need to check slow_ptr
            slow_ptr = slow_ptr.next
            fast_ptr = fast_ptr.next.next
            if slow_ptr == fast_ptr:
                return True

        return False
