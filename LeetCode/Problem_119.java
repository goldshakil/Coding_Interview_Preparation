class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int numRows=rowIndex;
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> prv = new ArrayList<Integer>();
		List<Integer> nxt = new ArrayList<Integer>();
	

		prv.add(1);
		list.add(prv);
		prv = new ArrayList<Integer>();
		if (numRows == 0)
			return list.get(0);
		prv.add(1);
		prv.add(1);
		list.add(prv);
		if (numRows == 1)
			return list.get(1);
        
        

		for (int n = 2; n <= numRows+1; n++) {
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
		return list.get(rowIndex);

        
    }
}
