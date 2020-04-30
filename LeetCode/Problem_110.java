

class Solution {

	// or you can use a boolean and change it to false in HERE
	public boolean isBalanced(TreeNode root) {
		// find the right and left depth

		if (depthFinder(root) < 0)
			return false;

		else
			return true;

	}

	public int depthFinder(TreeNode root) {
		if (root == null)
			return 0;

		else {
			int l_depth = depthFinder(root.left);

			int r_depth = depthFinder(root.right);

			if (l_depth == r_depth || l_depth - r_depth == 1 || r_depth - l_depth == 1) // return normal depth

				return Math.max(r_depth, l_depth) + 1;
			else // or return a negative flag
				return Integer.MIN_VALUE; // HERE
		}
	}
}
