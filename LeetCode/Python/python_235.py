# LC-235
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


# O(n) solution O(n) space -recursive stack (linear/skewed tree case)-> since we're splitting the search space by half every turn
# LCA node: should be (p<q) - clear separator:
# p in left subtree and q in its right subtree
# equal to p and q in its right subtree
# equal to q and p in its left subtree


def dfs(node,low,high):
    if not node:
        return None
    # Clear separator
    if low<=node.val<=high:
        return node
    # Separator in right subtree
    elif low>=node.val and high>=node.val:
        return dfs(node.right,low,high)
    # Separator in left subtree
    elif low<=node.val and high<=node.val:
        return dfs(node.left,low,high)

# iterative -> O(1) space
def iterative(node,low,high):
    while node:
            # Clear separator
        if low<=node.val<=high:
            return node
        # Separator in right subtree
        elif low>=node.val and high>=node.val:
            node=node.right
        # Separator in left subtree
        elif low<=node.val and high<=node.val:
            node=node.left
    return None
    
class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        
        # This is not ensured
        low=p.val
        high=q.val
        if high<low:
            low,high=high,low
            
            
        return iterative(root,low,high)
        
