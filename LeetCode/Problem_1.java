class Problem_1 {
  public int[] twoSum(int[] nums, int target) {
  
  //worst solution
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    
 
    
    throw new IllegalArgumentException("No two sum solution");
}
}

// bettersolution -> performs the best in leet code
/*
class Solution {
    public int[] twoSum(int[] nums0, int target) {
        
        int nums[]=Arrays.copyOf(nums0,nums0.length);
     
        Arrays.parallelSort(nums);
		int i=0;
		int j=nums.length-1;
		
		while(i!=j)
		{
          
			
			if(nums[i]+nums[j]<target )
			{
				i++;
			}
			else if(nums[i]+nums[j]>target) {
				j--;
			}
			else if(nums[i]+nums[j]==target){
                
				break;
               }
           
		}
        int answer[]=new int[2];
                
        int flag0=0;
    int flag1=0;
        for(int k=0;k<nums0.length;k++)
        {
                    
            if(nums0[k]==nums[i]&&flag0==0)
            { //System.out.println(k);
                answer[0]=k;
             flag0=1;
             
             }
            else if(nums0[k]==nums[j]&&flag1==0)
            {
                 //System.out.println(k);
                answer[1]=k;
                flag1=1;
            }
        }
        
 
        return answer;
		
        
    }
}

*/

// the best soltuion (not the highest time)
/*
class Solution {
	public int[] twoSum(int[] original, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // key is the number //value is the index

		for (int i = 0; i < original.length; i++) {
			map.put(original[i], i);
		}

		System.out.println(map);


		for (int i = 0; i < original.length; i++) {
			int complement = target - original[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i,map.get(complement)};
            
			}
		}
	throw new IllegalArgumentException("No two sum solution");
	}
}
*/
