
class Solution {

	// use DFS to traverse the tree -> make as visited and visited not visited

	ArrayList<TreeNode> visited = new ArrayList<TreeNode>(); // to mark the visited one

	void DFS(TreeNode node, ArrayList<Integer> tree) // use tree 1 as a marker
	{
		if (node == null) {
			tree.add(-1);
			return;
		}

		visited.add(node); // mark as visited.

		tree.add(node.val);

		// visit univisted
		if (!visited.contains(node.left))
			DFS(node.left, tree);

		if (!visited.contains(node.right))
			DFS(node.right, tree);

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		ArrayList<Integer> tree1 = new ArrayList<Integer>();
		ArrayList<Integer> tree2 = new ArrayList<Integer>();
		DFS(p, tree1);
		visited.clear();
		DFS(q, tree2);

		return tree1.equals(tree2);
	}
}
