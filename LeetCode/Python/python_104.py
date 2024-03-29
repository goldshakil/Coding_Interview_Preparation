# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right



# Think about 2 or 3 nodes
def dfs(node):
    # returns the max_depth from leaf up to node
    if not node: # null node -> tree height=0
        return 0 
    return 1+max(dfs(node.left),dfs(node.right))  #+1 because we found a node (add the depth coming up)
    
        
    
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        # O(N) solution and O(N) space (linear binary tree case)
        return dfs(root)
        
