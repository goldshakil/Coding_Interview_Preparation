class Solution {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> prv = new ArrayList<Integer>();
		List<Integer> nxt = new ArrayList<Integer>();
		if (numRows == 0)
			return list;

		prv.add(1);
		list.add(prv);
		prv = new ArrayList<Integer>();
		if (numRows == 1)
			return list;
		prv.add(1);
		prv.add(1);
		list.add(prv);
		if (numRows == 2)
			return list;
        
        

		for (int n = 3; n <= numRows; n++) {
			nxt.add(1);
			for (int i = 0; i < prv.size() - 1; i++) {
				nxt.add(prv.get(i) + prv.get(i + 1));

			}
			nxt.add(1);
			// System.out.println(nxt);
			list.add(nxt);
			prv = nxt;
			nxt = new ArrayList<Integer>();

		}
		return list;

	}
}
