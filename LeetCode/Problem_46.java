class Solution {
    List<List<Integer>> list = new ArrayList<List<Integer>>();

	public void DFS(int left, int right, int nums[]) {
		if (left == right) {
			//System.out.println(Arrays.toString(nums));
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				temp.add(nums[i]);
			}
			
			list.add(temp);
			
			return;
		}

		else {
			for (int i = left; i < nums.length; i++) {
				// swap
				int temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				DFS(left + 1, right, nums);

				// backtrack
				temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;

			}
		}
	}
    public List<List<Integer>> permute(int[] nums) {
        
        DFS(0, nums.length, nums);
		
		return list;
    }
}
