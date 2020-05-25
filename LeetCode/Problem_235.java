/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

	// IT IS A BST!!!! this code is more complicated that works for any binary tree!

	// finds whether a node is in a right or LEFT subtree or not
	public boolean find(TreeNode node, TreeNode p, TreeNode q) {
		if (node == null)
			return false;
		if (node.val == p.val || node.val == q.val)
			return true;

		// visit left
		boolean result;
		result = find(node.left, p, q);

		boolean res2;
		res2 = find(node.right, p, q);

		return (res2 || result);

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		// stop DFS
		if (root == null)
			return null;

		// condition 1: the elements are in the right and left subtree of root
		if (find(root.right, p, q) && find(root.left, p, q)) {
			return root;
		}
		// condition 2: root itself as an element
		if (find(root.right, p, q) && (root.val == p.val || root.val == q.val)) {
			return root;
		}
		if (find(root.left, p, q) && (root.val == p.val || root.val == q.val)) {
			return root;
		}

		// visit children
		TreeNode temp = lowestCommonAncestor(root.left, p, q);
		TreeNode temp2 = lowestCommonAncestor(root.right, p, q);

		if (temp != null)
			return temp;
		if (temp2 != null)
			return temp2;
		return null;

	}
}
