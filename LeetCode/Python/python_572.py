# LC-572
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

def same_tree(node1,node2):
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
    return same_tree(node1.right,node2.right) and same_tree(node1.left,node2.left)


# Without global variable is cleaner
sub_found=False
def dfs(node,sub_node): #preorder
    global sub_found
    
    if not node and not sub_node:
        return
    if node and not sub_node:
        return
    if not node and sub_node:
        return
    
    if node.val==sub_node.val:
        if same_tree(node,sub_node):
            sub_found=True
        
    
    dfs(node.left,sub_node)
    dfs(node.right,sub_node)
        
        
    

class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        # O(Size of tree multiplied) solution: for every node you're checking if it the same tree as the subtree
        
        global sub_found
        dfs(root,subRoot)
        # LC reset
        temp=sub_found
        sub_found=False
        return temp
        
        
