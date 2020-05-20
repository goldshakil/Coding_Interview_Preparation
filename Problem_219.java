class Solution {
    
    	public boolean checker(ArrayList<Integer> list, int k, int newIdx) {

		for (int i = 0; i < list.size(); i++) {
			if (newIdx - list.get(i) <= k) {
				return true;

			}
		}

		list.add(newIdx);
		return false;
	}
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
       HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				ArrayList<Integer> list = map.get(nums[i]);
				if (checker(list, k, i)) {
					return true;
				}

			} else {
				// first time create a list as a value for the key
				// the list contains indices
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				map.put(nums[i], temp);

			}

		}
        
        return false;
        
    }
}
