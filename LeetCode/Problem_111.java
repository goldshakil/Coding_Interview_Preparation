class Solution {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int l_depth = minDepth(root.left);
			int r_depth = minDepth(root.right);

			if (l_depth == 0 && r_depth != 0) // one child at a node
			{
				return r_depth + 1;
			}
			if (l_depth != 0 && r_depth == 0) // one child at a node
			{
				return l_depth + 1;
			}

            return Math.min(l_depth,r_depth)+1;
        }
        
    }
}
