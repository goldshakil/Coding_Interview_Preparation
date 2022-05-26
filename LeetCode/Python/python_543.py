# LC-543
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Key idea: at this node what are the farthest nodes
# AKA: find max_depth of the left subtree and the right_subtree
# the summation fo the two max_depth should be the diameter

# Solution1: Brute force solution O(N^2) time and O(N)space: for every node compute left and right max_depths
"""
def max_depth(node):
    if not node: # null node -> tree height=0
        return 0 
    return 1+max(max_depth(node.left),max_depth(node.right))  #+1 because we found a node (add the depth coming up - bottom up)

ans=0
def find_dia(node):
    global ans
    if node:
        node_left_max_depth=max_depth(node.left)
        node_right_max_depth=max_depth(node.right)
        ans=max(ans,node_left_max_depth+node_right_max_depth)
        find_dia(node.left)
        find_dia(node.right)
    
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        global ans
        find_dia(root)
        max_dia=ans
        ans=0 # leetcode resetting
        return max_dia
"""

# Solution 2: same idea but utilize the fact that we compute the max_depth computed bottom-up O(N) time O(N) memory (linear tree)
ans=0
def max_depth(node):
    # returns the max_depth from leaf/bottom up to node
    global ans
    if not node: # null node -> tree height=0
        return 0
    
    max_left_depth=max_depth(node.left)
    max_right_depth=max_depth(node.right)
    ans=max(ans,max_left_depth+max_right_depth)
    
    
    
    return 1+max(max_left_depth,max_right_depth)  #+1 because we found a node (add the depth coming up)
        
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        global ans
        max_depth(root)
        max_dia=ans
        ans=0 # leetcode resetting
        return max_dia


       
