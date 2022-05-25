# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

def dfs_recursive(node,res):
    # inorder
    if node:
        dfs_recursive(node.left,res)
        res.append(node.val)
        dfs_recursive(node.right,res)

    
def dfs_traversal_iterative_inorder(node, res):
    # left-root-right
    # Basic idea:
    # 1. keep going left and add to your stack (left processing)
    # 2. you hit a null -> we reached the end
    # 3. print null's parent (pop from stack) (in processing)
    # 4. go right (right processing)

    stack = []

    # note: node represents the node to be processed

    while True:
        if node:
            # process left
            stack.append(node)
            node = node.left
        else:
            if len(stack) != 0:
                # process in
                node = stack.pop()
                res.append(node.val)
                # process right
                node = node.right
            else:
                # no node to process and stack is empty
                break
    
        
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        # left, node, right
        res=[]
        # Call the recursive or iteratve function
        dfs_traversal_iterative_inorder(root,res)
        
        return res
        
