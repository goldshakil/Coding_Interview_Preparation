class Solution {
    public int maxSubArray(int[] nums) {
        
        // 3 solutions -> -> 
        //brute -> n^2
        // divide and conquer -> nlgn
        
        //3 : use kadane's algorithm 
        // find the sum until that element (local_max): is it higher than thw whole sum upto the previous point?
        //
        // find the global -> keep track of the maximum between those local_max
        
        int local=nums[0];
        int global=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            local=Math.max(nums[i],local+nums[i]);//start a new one? or continue?
            
            global=Math.max(local,global);
        }
        
        return global;
        
    }
}
