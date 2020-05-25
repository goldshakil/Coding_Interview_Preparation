
class Solution {
    public boolean canJump(int[] nums) {
        
        //KEY IDEA: traverse from the right most element and see if it can be reached by the element before it
        //Greedy: BEST Solution always pick the biggest jump

	//Key idea here: keep track of the most right index that can be reached
	//if eventually the right most index that can be reached >= length -> true
	//if the ith index is more than what max can be reached  -> false
        
        
        int max=0; //max index that can be reached
        int i=0;
        while(max<nums.length-1)
        {
            if(i>max) return false;
            
            max=Math.max(max,i+nums[i]);
            i++;
            
            
        }
        
        return true;
    }
}

/*
class Solution {
    
    public boolean DFS(int nums[], int curIdx) {

		// base condition
		if (curIdx == nums.length - 1) {
			//System.out.println(list);
			return true; // true;

		}

		// visit children -> start from bigger jumps / instead of trying 1 jumo then two jumos for 2 try 2 then 1
		for (int i = curIdx + nums[curIdx]; i >curIdx ; i--) {
            
            //jump is out of bounds
        if (i >= nums.length)
				continue;
			// add element
			//list.add(nums[i]);

			if (DFS(nums, i)) // if solution found
				return true;

			// backtrack
			//list.remove(list.size() - 1);
		}
		return false;


	}
    public boolean canJump(int[] nums) {
        
        if(nums.length==1) return true;
     //   List<Integer> list = new ArrayList<Integer>();
	//	list.add(nums[0]); // this is the strting point

		return DFS(nums, 0);
        
    }
}
