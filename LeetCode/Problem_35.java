class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int answer=0;
        
        if(nums[0]>target) return 0;
        if(nums[nums.length-1]<target)return nums.length;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target){
                
                answer=i;
                break;
            }
           // else if(nums[i]>ta)        
        }
        
        
        return answer;
      
    }
}
