class Solution {
    
    // use the right data type
    static boolean oppositeChecker(char stackElement, char newElement) {

		 if (stackElement=='{' && newElement=='}') {
			return true;
		} else if (stackElement=='(' && newElement==')') {
			return true;
		} else if (stackElement=='[' && newElement==']') {
			return true;
		} else {
			return false;
		}

	}
    public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char current_element = s.charAt(i);

			if (current_element=='{' || current_element=='(' || current_element=='[') {
				stack.push(current_element);
				continue;
			}
            else
            {
                if(stack.empty())return false;
            }


				if (oppositeChecker(stack.peek(), current_element))
				{
					stack.pop();

				} else 
				{
					stack.push(current_element);
				}
			

		}

		return stack.empty();
    
    }
}
