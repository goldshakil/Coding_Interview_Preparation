class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       HashSet<Integer> set= new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
               // map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        
       
        return false;
        
    }
}
