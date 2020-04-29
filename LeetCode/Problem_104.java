
class Solution {
	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;
		else {
			
			//comapre
			int left_depth = maxDepth(root.left);

			int right_depth = maxDepth(root.right);

			return Math.max(left_depth, right_depth) + 1;  //add one to the depth when returning to parent
		}

	}
}
