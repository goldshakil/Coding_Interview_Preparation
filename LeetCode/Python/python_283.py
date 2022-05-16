#LC-283
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # O(N) time, O(N) space solution -> create a new list and append the numbers to it when non zero -> add zeros
        # O(N^2) time, O(1) space solution -> Count the zeros -> remove zeros while there are zeros (O(N^2)) -> add zeros
        
        #O(N) time, O(1) space solution -> keep track where to put the non zero element -> kinda 2 pointer
        non_zero_idx=0 # Where to put the non zero if found
        for i in range(len(nums)):
            if nums[i]!=0:
                # Bring the non zero element here
                nums[i], nums[non_zero_idx] = nums[non_zero_idx], nums[i] # Nice swapping syntax
                non_zero_idx+=1 # This idx also represents the count of non zero items
                
        
                
        
