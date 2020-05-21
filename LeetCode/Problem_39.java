class Solution {
    
    public List<List<Integer>> list = new ArrayList<List<Integer>>();



	public void DFS(int candidates[], int target, ArrayList<Integer> cur,int sum) {
		// System.out.println(cur);
		if (sum == target) {
			// System.out.println(cur);

			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < cur.size(); j++) {
				temp.add(cur.get(j));
			}
			boolean add = true;
			// don't add the same one -> no same length lists
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).size() == temp.size()) {

					Collections.sort(list.get(i));
					Collections.sort(temp);
					if (temp.equals(list.get(i))) {
						add = false;
						break;
					}
				}
			}
			if (add == true)
				list.add(temp);
		}
		// reached limit
		if (sum > target) {
			return;
		}

		// visit children
		for (int i = 0; i < candidates.length; i++) {
            

			cur.add(candidates[i]);
            sum+=candidates[i];

			DFS(candidates, target, cur,sum);

			cur.remove(cur.size() - 1); // backtrack
             sum-=candidates[i]; //backtrack

		}

	}
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> cur = new ArrayList<Integer>();
		DFS(candidates, target, cur,0);
        return list;
    }
}
