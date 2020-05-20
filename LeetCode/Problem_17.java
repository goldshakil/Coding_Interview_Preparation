class Solution {
    
    public char[] generator(char number) {
		if (number == '2') {
			char children[] = { 'a', 'b', 'c' };

			return children;
		} else if (number == '3') {
			char children[] = { 'd', 'e', 'f' };

			return children;
		}

		else if (number == '4') {
			char children[] = { 'g', 'h', 'i' };

			return children;
		} else if (number == '5') {
			char children[] = { 'j', 'k', 'l' };

			return children;
		} else if (number == '6') {
			char children[] = { 'm', 'n', 'o' };

			return children;
		} else if (number == '7') {
			char children[] = { 'p', 'q', 'r', 's' };

			return children;
		} else if (number == '8') {
			char children[] = { 't', 'u', 'v' };

			return children;
		} else // number ==9
		{
			char children[] = { 'w', 'x', 'y', 'z' };

			return children;
		}

	}
    
    List<String> list=new ArrayList<String>();
	public void DFS(int left, int right, String original, String answer) {

		if (left == right) {
			list.add(answer);
			return;
		}

		// get the children based on left and orignal
		char children[] = generator(original.charAt(left));
		
		//System.out.println(Arrays.toString(children));

		// visit children
		for (int i = 0; i < children.length; i++) {
			String new_string = answer + children[i];
			DFS(left + 1, right, original, new_string);

		}

	}
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0)
        {
            return list;
        }
            
        DFS(0,digits.length(),digits,"");
        return list;
    }
}
