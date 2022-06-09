# LC-100
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

def dfs(node1,node2):
    if not node1 and not node2:
        return True
    if node1 and not node2:
        return False
    if not node1 and node2:
        return False
    if node1.val!=node2.val:
        return False
    # Node values are equal now go deeper
    # Should be equal for right and left subtree
    return dfs(node1.right,node2.right) and dfs(node1.left,node2.left)
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        
        return dfs(p,q)
        
