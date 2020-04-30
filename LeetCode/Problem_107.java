
class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		// level order -> BFS
		List<List<Integer>> final_list = new ArrayList<List<Integer>>();

		if (root == null)
			return final_list;

		Queue<TreeNode> parent = new LinkedList<TreeNode>(); // when this gets empty
		Queue<TreeNode> children = new LinkedList<TreeNode>(); // add the children temporarily here
		ArrayList<Integer> temp_list = new ArrayList<Integer>();

		parent.add(root);
		while (!parent.isEmpty()) {
			TreeNode current = parent.poll(); // being visited

			temp_list.add(current.val);

			// enqueue the children of visited
			if (current.left != null) {
				children.add(current.left);
			}
			if (current.right != null)
				children.add(current.right);

			if (parent.isEmpty()) // finished one level
			{
				final_list.add(0, temp_list);
				temp_list = new ArrayList(); // remeber that temp_list is just a reference variables
				Queue<TreeNode> temp = parent;
				parent = children;
				children = temp;
			}

		}

		return final_list;

	}
}
