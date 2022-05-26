#LC-169
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # O(N^2)-> Nested loop -> count each number -> store max
        # O(N*LOG(N)) -> Sorting -> pick nums[(n//2)]
        # O(N) -> Use a hashmap -> O(N) Space
        
        # O(N) time O(1) space -> keyword is more than half - floor(n/2)
        # Boyer-Moore -> The intuition is that the majority number count will be +1
        #                compared to other elements
        # e.g = [2,2,1,3,4,2,2] 
        # aka =>    [2,2,2,2,1,3,4]
        # count(2): [1,2,3,4,3,2,1] -> last count is 1 as expected
        
        majority_element=nums[0]
        count=1
        
        for i in nums[1:]:
            if i==majority_element:
                count+=1
            else:
                count-=1
                if count==0:
                    # found enough non major elements to disregard our current selection
                    # Let's try a new candidate 
                    count=1
                    majority_element=i
    
        return majority_element
