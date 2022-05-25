
from collections import deque


print("#############")


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# BFS
def bfs_traversal(root):
    queue = deque()
    # no need for visited set since the elements in a binary tree are queued once
    queue.append(root)
    while len(queue) > 0:
        node = queue.popleft()
        print(node.val)
        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)


# DFS can be done recusrively - using call stack
# DFS has three kind of traversals (printing) - inorder, postorder, preorder

# DFS: INORDER
def dfs_traversal_recursive_inorder(node):
    # left-root-right
    if node:
        dfs_traversal_recursive_inorder(node.left)
        print(node.val)
        dfs_traversal_recursive_inorder(node.right)


def dfs_traversal_iterative_inorder(node):
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
                print(node.val)
                # process right
                node = node.right
            else:
                # no node to process and stack is empty
                break


# DFS: PREORDER
def dfs_traversal_recursive_preorder(node):
    # root/previsit-left-right
    if node:
        print(node.val)
        dfs_traversal_recursive_preorder(node.left)
        dfs_traversal_recursive_preorder(node.right)


def dfs_traversal_iterative_preorder(root):
    # root/previsit-left-right
    stack = []
    stack.append(root)
    while len(stack) > 0:
        node = stack.pop()
        print(node.val)
        if node.right:
            stack.append(node.right)
        if node.left:
            stack.append(node.left)


# DFS: POSTORDER
def dfs_traversal_recursive_postorder(node):
    # left-right-root/postvisit
    if node:
        dfs_traversal_recursive_postorder(node.left)
        dfs_traversal_recursive_postorder(node.right)
        print(node.val)


def dfs_traversal_iterative_postorder(root):
    # left-right-root/postvisit

    stack = []  # visits root -> right -> left (modified preorder)
    stack2 = []  # visits opposite of stack1 -> left -> right -> root

    stack.append(root)

    while len(stack) > 0:
        node = stack.pop()
        stack2.append(node)  # last to be visited -> added first to stack 2
        if node.left:
            stack.append(node.left)
        if node.right:
            stack.append(node.right)

    while len(stack2) > 0:
        print(stack2.pop().val)


def main():
    # Tree
    #   1
    #  2  3
    # 4 5
    root = TreeNode(1)
    node2 = TreeNode(2)
    node3 = TreeNode(3)
    node4 = TreeNode(4)
    node5 = TreeNode(5)
    root.left = node2
    root.right = node3
    node2.left = node4
    node2.right = node5

    print("CALL WHATEVER FUNCTION YOU WANT:")

    dfs_traversal_iterative_postorder(root)


main()


print("#############")
