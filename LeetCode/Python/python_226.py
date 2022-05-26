# LC-226
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Think about 3 nodes
def invert(node):
    if node:
        node.right,node.left=invert(node.left),invert(node.right) # use temp if in separate lines
    return node

def invert_clearer(node): # identical to the above solution
    if node:
        # Swap the children
        node.right,node.left=node.left,node.right
        
        # Call for children
        invert_clearer(node.left)
        invert_clearer(node.right)
        
    return node
        
        
    
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        # O(N) since I am visiting each node one time
        # O(H) memory where H is max_depth in the tree
        
        # return invert(root)
        
        return invert_clearer(root)
        
        
