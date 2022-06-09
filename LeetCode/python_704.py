# LC-704
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # binary search can be recursive and iterative
        
        left=0
        right=len(nums)-1
        while left<=right:
            mid=(left+right)//2
            if target==nums[mid]:
                return mid
            elif target<nums[mid]:
                right=mid-1
            elif target>nums[mid]:
                left=mid+1
                
        return -1
                
        
