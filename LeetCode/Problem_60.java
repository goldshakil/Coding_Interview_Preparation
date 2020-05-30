class Solution {
    
    //the reason I didnt use DFS/backtracking because it doesn't generate the "lexiographic order"
    // the lexigoraphic order means: the smallest number should be in the left most position
    // the next lexographic order/next permutation means: what is a combination i can make out of these numbers which is just above the current number
    
    
    public void nextPermutation(int[] nums) {
        
        //scanf from left to right and find a decreasing element
		int i = nums.length - 2;
		while (i >= 0 && nums[i + 1] <= nums[i]) {
			i--;
		}
        
        //swap it with what ever just above it on its right
		if (i >= 0) {
			int j = nums.length - 1;
			while (j >= 0 && nums[j] <= nums[i]) {
				j--;
			}
			swap(nums, i, j);
		}
        
        // reverse the remaning sequence to make it the smallest
		reverse(nums, i + 1);
	}

	private void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
    public String getPermutation(int n, int k) {
        	
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		for (int i = 0; i < k-1; i++) {
			nextPermutation(a);
			
		}
		//System.out.println(Arrays.toString(a));
		StringBuilder str=new StringBuilder();
		for(int i=0;i<a.length;i++)
		{
			str.append(a[i]);
		}
        
        return str.toString();
    }
}
