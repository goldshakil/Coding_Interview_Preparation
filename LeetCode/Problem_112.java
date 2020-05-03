
class Solution {
	int answer = 0;
    boolean found=false;

	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;

		DFS(root, sum);

		return found;
	}

	// DFS

	public void DFS(TreeNode root, int sum) {

		
	
		answer += root.val;
	
        	

		// visited unvisited
		if (root.left != null) {
			DFS(root.left, sum);
		} 
        
        if(root.left==null&&root.right==null&&sum==answer)
        {
            found=true;
            return;
      
        }

            ///////////////////////
		if (root.right != null)
			DFS(root.right, sum);
         if(root.left==null&&root.right==null&&sum==answer)
        {
            found=true;
             return;
        }
		
        answer -= root.val;
	}
}
