class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        
		List<List<String>> list = new ArrayList<List<String>>();

		//String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		String temp[] = Arrays.copyOf(str, str.length);

		// System.out.println(Arrays.toString(temp));

		for (int i = 0; i < temp.length; i++) {
			char arr[] = temp[i].toCharArray();
			Arrays.sort(arr);
			temp[i] = String.valueOf(arr);
		}

		ArrayList<String> dict = new ArrayList<String>();
        
		for (int i = 0; i < temp.length; i++) {
			int index = dict.indexOf(temp[i]);
			
			// a new annangram has been found
			if (index < 0) {
				dict.add(temp[i]);
				List<String> anagramlist = new ArrayList<String>();
				anagramlist.add(str[i]);
				list.add(anagramlist);
			}
			// a similar list thingy
			else {
				list.get(index).add(str[i]);
			}

		}
        
        return list;
        
    }
}
