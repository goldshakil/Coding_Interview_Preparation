class Solution {
    
    // remember in combinations I shouldn't have 3,1 1,3
    
     List<List<Integer>> list = new ArrayList<List<Integer>>();

	public void DFS(List<Integer> temp, int k, int n, int left,int cur_size) {
		if (cur_size == k) {
            
            List<Integer> storer = new ArrayList<Integer>(temp);
            
			list.add(storer);
            return;
           
		} else {
			for (int i = left; i <= n; i++) {
                
					temp.add(i);
                cur_size++;
                    // add an element from its right
					DFS(temp, k, n, i + 1,cur_size);
                cur_size--;
					temp.remove(temp.size() - 1);
				
			}

		}

	}
    public List<List<Integer>> combine(int n, int k) {
        if(n==0) return list;
        
        List<Integer> temp = new ArrayList<Integer>();
		DFS(temp, k, n, 1,0); 
        
        return list;
    }
}
