//next greater lexigrophacillay bla bla -> simply means what is the number that is JUST greater than this number  ("this number" is represented by the array)

//highest numbers should be to the most left so we can get the highest number (scan from right to left)(increasing order part)
//find the first number that is lower to whatever is on it's right
// swap that element with whatever is just above it
// now the increasing order part is at its highest value -> left most number is the biggest -> swap it 


public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
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
}


/*
//DFS -> O(n!) solution -> time exceeded
class Solution {

     int times=0;
	 int nums_best[];
	 int original[];

	public  void DFS(int left, int right, int nums[]) {
		if (left == right) {
			//System.out.println(Arrays.toString(nums));
			if(times==0)
			{
				times++; 
				return;
			}
			if(times==1&&!Arrays.equals(nums, original))
			{
				nums_best=new int[nums.length];
				nums_best=Arrays.copyOf(nums, nums.length);
				times++;
			}
			else
			{
				if(Arrays.compare(nums_best,nums)>0&&!Arrays.equals(nums, original))
				{
					nums_best=Arrays.copyOf(nums, nums.length);
					
				}
				
			}
		
			
			System.out.println("BEST"+Arrays.toString(nums_best));
			return;
		}

		else {
			for (int i = left; i < nums.length; i++) {
				// swap
				int temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				DFS(left + 1, right, nums);

				// backtrack
				temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;

			}
		}
	}
    public void nextPermutation(int[] nums) {
        	original=Arrays.copyOf(nums, nums.length);
        	DFS(0, nums.length, nums);
        nums=Arrays.copyOf(nums_best,nums_best.length);
        
        
    }
}
*/
