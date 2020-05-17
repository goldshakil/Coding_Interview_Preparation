class Solution {
    public boolean isIsomorphic(String s, String t) {
        

		// character , locations
        if(s.length()!=t.length()) return false;
		HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
		HashMap<Character, ArrayList<Integer>> map2 = new HashMap<Character, ArrayList<Integer>>();


		// Process String one
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(s.charAt(i), list);
			} else {
				ArrayList<Integer> list = map.get(s.charAt(i));
				list.add(i);
			}
		}

		// Process String two
		for (int i = 0; i < t.length(); i++) {
			if (!map2.containsKey(t.charAt(i))) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map2.put(t.charAt(i), list);
			} else {
				ArrayList<Integer> list = map2.get(t.charAt(i));
				list.add(i);
			}

		}

        
          if(map.size()!=map2.size()) return false;
        
		for (Map.Entry<Character, ArrayList<Integer>> entry : map.entrySet()) {

			ArrayList<Integer> list = entry.getValue();
			boolean flag = true;
			for (Map.Entry<Character, ArrayList<Integer>> entry2 : map2.entrySet()) {
				ArrayList<Integer> list2 = entry2.getValue();

				if (list.equals(list2)) {
                    map2.remove(entry2.getKey()); 

					flag = true;
					break;

				} else {
					flag = false;
				}

			}
			
			//System.out.println(entry.getKey());
			if(flag==false)
			{
				//couldn't find one
                return false;
                
			}
			

		}
        return true;
        
    }
}
