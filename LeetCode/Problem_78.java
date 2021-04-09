class Solution {
    
    //power set
    //you can use a dfs and add all elements and return when you reach length
    
    
     List<List<Integer>> list = new ArrayList<List<Integer>>();
	
	public void DFS(int nums[],int left, List<Integer>temp)
	{
		list.add(new ArrayList<>(temp));
		
		if(left>=nums.length)
		{
			return;
		}
		else
		{
			for(int i=left;i<nums.length;i++)
			{
				temp.add(nums[i]);
				
				DFS(nums,i+1,temp);
				temp.remove(temp.size()-1);
				
			}
		}
		
	}

    public List<List<Integer>> subsets(int[] nums) {
       List<Integer> temp= new ArrayList<Integer>();
		DFS(nums,0,temp);
        return list;
    }
}
