# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Similar to LC-543
# Solution1: Brute force solution O(N^2) time and O(N)space: for every node compute left and right max_depths

# Solution2: Same idea but utilize the fact that we compute the max_depth computed bottom-up-> O(N) time, O(N) memory (linear tree case ) 

balanced=True
def max_depth(node):
    global balanced
    if not node:
        return 0
    
    left_depth=max_depth(node.left)
    right_depth=max_depth(node.right)
    
    if abs(left_depth-right_depth)>1:
        balanced=False
    
    return 1+max(left_depth,right_depth)
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        global balanced
        max_depth(root)
        # LC reset
        temp=balanced
        balanced=True
        return temp
        
        
        
        
        
