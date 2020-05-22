class Solution {
	public List<List<Integer>> list = new ArrayList<List<Integer>>();

	public void DFS(int candidates[], int left, int right) {
		if (left == right) {
			// System.out.println(Arrays.toString(candidates));

			List<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < candidates.length; i++) {
				temp.add(candidates[i]);
			}

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).equals(temp))
					return;
			}

			list.add(temp);

			return;
		}

		// visit children
		for (int i = left; i < candidates.length; i++) {
			// swap left with i
			int temp = candidates[i];
			candidates[i] = candidates[left];
			candidates[left] = temp;
			DFS(candidates, left + 1, right);

			// backtrack
			temp = candidates[i];
			candidates[i] = candidates[left];
			candidates[left] = temp;

		}

	}

	public List<List<Integer>> permuteUnique(int[] candidates) {
		DFS(candidates, 0, candidates.length - 1);
		return list;
	}
}
