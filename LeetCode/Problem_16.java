class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
    

		// worst case is O(n^3)-> brute force

		// this solution runs in O(n^2)
		Arrays.sort(nums); // O nlgn

        int min=Integer.MAX_VALUE; //store the difference
        int best_sum=0;
	

		for (int a = 0; a < nums.length - 2; a++) {
			

			int b = a + 1; // directly after 1
			int c = nums.length - 1; // last one

			while (b < c) {
                
                //saving the min
                if(Math.abs((nums[a]+nums[b]+nums[c]-target))<min)
                {
                    best_sum=nums[a]+nums[b]+nums[c];
                    min=Math.abs(nums[a]+nums[b]+nums[c]-target);    
                }
                
                // convergence!
                  if(nums[a]+nums[b]+nums[c]==target)
                {
                    min=nums[a]+nums[b]+nums[c];
                    return target;
                }
                else if(nums[a]+nums[b]+nums[c]>target)
                {
                    c--;
                }
                 else if(nums[a]+nums[b]+nums[c]<target)
                {
                    b++;
                }
                
                
				
			}
		}
		return best_sum;

	}
}
        
