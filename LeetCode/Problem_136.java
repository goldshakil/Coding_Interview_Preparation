class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums); // similar numbers are next to each other
        int i=0;
        for(i=0;i<nums.length-1;i+=2)
        {
           // System.out.println(i);
            if(i>nums.length-1)break;
            
             else if(nums[i]!=nums[i+1])
            {
                break;
            }
            
        }
        return nums[i];
        
    }
}
