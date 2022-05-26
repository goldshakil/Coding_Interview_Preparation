# LC-101
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


# Think about 3 nodes -> simplify
def dfs_compare(l_node,r_node):
    if l_node and r_node is None:
        return False
    elif r_node and l_node is None:
        return False
    elif l_node and r_node:
        # PREORDER for left subtree (l_node) -> N L R
        # PREORDER modified righ subtree (r_node) -> N R L
        if l_node.val!=r_node.val:
            return False
        return dfs_compare(l_node.left,r_node.right) and dfs_compare(l_node.right,r_node.left)
        
    return True # both are None and didn't fail before
        


def iterative_dfs_compare(l_root,r_root):
    # PREORDER for left subtree (l_node) -> N L R
    # PREORDER modified righ subtree (r_node) -> N R L
    
    l_stack=[]
    r_stack=[]
    l_stack.append(l_root)
    r_stack.append(r_root)
    
    while len(l_stack) and len(r_stack):
        l_node=l_stack.pop()
        r_node=r_stack.pop()
        
        if l_node.val!=r_node.val:
            return False
        
        # for l_node L R
        # for r_node R L
        
        if l_node.right and r_node.left:
            l_stack.append(l_node.right)
            r_stack.append(r_node.left)
        elif l_node.right and r_node.left is None:
            return False
        elif l_node.right is None and r_node.left:
            return False
            
        if l_node.left and r_node.right:
            l_stack.append(l_node.left)
            r_stack.append(r_node.right)
        elif l_node.left and r_node.right is None:
            return False
        elif l_node.left is None and r_node.right:
            return False
             
    
    if len(l_stack) or len(r_stack):#remaining nodes left in one subtree
        return False
    
    return True

    
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        # Solution1
        # O(N) time and O(N) space simple solution would be doing a DFS-preorder for the left subtree and for the right subtree
        # and storing the traversal order for both subtrees and finally comparing them
        # for left_sub_tree -> node left right (preorder) 
        # for right_sub_tree -> node right left (preorder/modified)
        # when visiting a null node append (-101) to indicate null
        
        # Solution2
        # Similar to the above complextiy but without storing the traversal -> traverse together in one funtion
        # Worst case space complexity is O(N) since there will be maximum N/2 calls (tree depth) when the tree has two linear branches
        
        # 1 or 2 nodes
        if root.right is None and root.left:
            return False
        if root.right is None and root.left is None:
            return True
        if root.left is None and root.right:
            return False
        
        # Call either iterative or recursive
        return dfs_compare(root.left,root.right)

        
        
