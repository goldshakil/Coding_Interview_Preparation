def binary_search(left, right, val, nums):
    
    if right >= left:
        # mid = left + ((right - left) / 2) -> overflow fix
        mid = int((left+right)/2)
        if nums[mid] == val:
            return mid
        if val > nums[mid]:
            return binary_search(mid+1, right, val, nums)
        if val < nums[mid]:
            return binary_search(left, mid-1, val, nums)

    return left # Think nums=[2] and we try to search for 3 or 1 -> left is the answer
    
class Solution:


    def searchInsert(self, nums: List[int], target: int) -> int:
        
        return binary_search(0,len(nums)-1,target,nums) # O(LOG(N))
        
