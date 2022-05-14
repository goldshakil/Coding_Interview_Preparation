#LC-53
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        # O(N) solution
        
        max_sum=nums[0]
        window_sum=nums[0]
        
        for i in nums[1:]: #Cool syntax to start from the second element -> slicing is fast
            if window_sum+i>i: # Option1: Add the new element to the window
                window_sum=window_sum+i
            else:
                window_sum=i #Option2: Start a new window
                
            max_sum=max(max_sum,window_sum) # Compare the max to the new window sum
            
        return max_sum
        
        
     
#     O(N^2) Solution -> Time Exceeds
#         arr_length=len(nums)
#         max_sum=nums[0]
#         for i in range(0,arr_length,1):
#             sum=nums[i]
#             max_sum=max(sum,max_sum)
#             for j in range(i+1,arr_length,1):
#                 sum+=nums[j]
#                 max_sum=max(sum,max_sum)
        
#         return max_sum
