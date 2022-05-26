# LC-104
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right



# Think about 2 or 3 nodes
def dfs(node,depth):
    if node:
        max_depth=max(dfs(node.left,depth+1),dfs(node.right,depth+1))
        return max_depth
    return depth
        
    
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        # O(N) solution and O(N) space (linear binary tree case)
        return dfs(root,0)
        
