# LC-268

# Explanation: There are n numebrs in the array and we have n+1 choices find the missing number
# The array should be [0,1,2,3,4,...n]
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        
        # O(n^2): for every number [0,n] -> loop through the array and return if missing
        
        
        
        # O(n logn) time O(1) space: sort then check if every number [0,n] exists
        '''
        nums.sort()
        n=len(nums)
        counter=0
        for i in range(0,n): 
            if i!=nums[counter]:
                return i
            counter+=1
        # array has numbers [0...n-1] -> missing is n - last number
        return n
        '''
    
    
    
        # O(n) time and O(n) space: create a set of number [0,n+1], loop through the array and keep removing the numbers you find in the array -> eventually you'll end up with one number 
        '''
        hash_set=set()
        n=len(nums)
        
        for i in range(0,n+1):
            hash_set.add(i)
            
        for i in nums:
            if i in hash_set:
                hash_set.remove(i)
        
        for i in hash_set:
            return i
        '''
        
        # O(N) time and O(1) space: XOR expected array with given array -> every number will have 2 occurences except 1
        # Remember: X XOR X is Zero and the XOR order doesn't matter
        '''
        ans=0
        n=len(nums)
        # Expected
        for i in range(n+1):
            ans=ans^i
        # Given
        for i in nums:
            ans=ans^i
            
        return ans
        '''
        
         # O(N) time and O(1) space: expected_sum - given_sum
        n=len(nums)
        expected_sum=0
        for i in range(n+1):
            expected_sum+=i
            
        given_sum=0
        for i in nums:
            given_sum+=i
            
        return expected_sum-given_sum
        
        
            
        
