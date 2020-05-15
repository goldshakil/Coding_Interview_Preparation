class Solution {
    
    List<String> list=new ArrayList<String>();
    
    
    //early checking -> no need for this function
    public boolean validate(String answer) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < answer.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(answer.charAt(i));
			} else if ((stack.peek() == '(' )&& (answer.charAt(i) == ')')) {
				stack.pop();
			} else {
				stack.push(answer.charAt(i));
			}
			//System.out.println(stack);

		}

		if (stack.isEmpty())
			return true;

		return false;

	}
    
    public void DFS(int left, int right, String answer,int open,int closed) {

		if (left == right) {
			//if (validate(answer))  //early checking so no need to validate
            {
                list.add(answer);
                
            }
			//System.out.println(answer);
			return;
		}

		// get the children based on left and orignal

		// System.out.println(Arrays.toString(children));

        //children
		//early check -> add only possible 
		if(open<right/2)
			DFS(left + 1, right, answer + '(',open+1,closed);
		
		if(closed<open)
			DFS(left + 1, right, answer + ')',open,closed+1);

	}
    public List<String> generateParenthesis(int n) {
        DFS(1, n*2, "(",1,0);
        
        return list;
    }
}
