
class Solution {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null)
			return true;
		else if ((t1 == null && t2 != null) || (t2 == null && t1 != null))
			return false;

		else if (t1.val == t2.val)
			return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);

		else
			return false;

	}
}
